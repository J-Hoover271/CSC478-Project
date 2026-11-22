package uno.game;

import uno.cards.Card;
import uno.cards.CardColor;
import uno.model.Deck;
import uno.model.DiscardPile;
import uno.model.Hand;
import uno.player.Player;
import uno.rules.MoveValidator;

import java.util.List;

public class Round {
    private List<Player> players;
    private Deck deck;
    private DiscardPile discardPile;
    private MoveValidator moveValidator;
    private TurnManager turnManager;

    private RoundPhase phase;
    private Card drawnCard;
    private Card pendingWild;

    public Round(List<Player> players, MoveValidator validator) {
        this.players = List.copyOf(players);
        this.moveValidator = validator;
        this.deck = new Deck();
        this.deck.shuffle();
        deal();
        this.discardPile = new DiscardPile();
        this.turnManager = new TurnManager(this.players);
        this.phase = RoundPhase.AWAITING_PLAY;
    }

    public RoundPhase getPhase() {
        return phase;
    }

    public Player getCurrentPlayer() {
        return turnManager.getCurrentPlayer();
    }

    public Direction getDirection() {
        return turnManager.getDirection();
    }

    public void playCard(Card card) {
        if (phase == RoundPhase.DRAWN_CARD) {
            if (card != drawnCard) {
                throw new IllegalArgumentException("You must play the card drawn, or pass.");
            }
        } else {
            requiredPhase(RoundPhase.AWAITING_PLAY);
        }

        if (!isLegal(card)) {
            throw new IllegalArgumentException("You can't play this card.");
        }

        Hand hand = getCurrentPlayer().getHand();
        hand.remove(card);
        discardPile.place(card);
        drawnCard = null;

        if (card.isWild() && !hand.isEmpty()) {
            pendingWild = card;
            phase = RoundPhase.CHOOSING_COLOR;
            return;
        }
        if (!card.isWild()) {
            discardPile.setActiveColor(card.getColor());
        }

        resolve(card);
    }

    public void drawCard() {
        requiredPhase(RoundPhase.AWAITING_PLAY);
        Card card = drawFromDeck();
        getCurrentPlayer().getHand().add(card);

        if(isLegal(card)) {
            drawnCard = card;
            phase = RoundPhase.DRAWN_CARD;
        } else {
            finishTurn();
        }
    }

    public void pass() {
        requiredPhase(RoundPhase.DRAWN_CARD);
        drawnCard = null;
        finishTurn();
    }

    public void chooseColor(CardColor color) {
        requiredPhase(RoundPhase.CHOOSING_COLOR);
        discardPile.setActiveColor(color);
        Card wild = pendingWild;
        pendingWild = null;
        resolve(wild);
    }

    private void deal() {
        for (Player player : players) {
            player.getHand().clear();
        }
        for (int i = 0; i < 7; i++) {
            for (Player player : players) {
                player.getHand().add(deck.draw());
            }
        }
    }

    private void applyEffect(Card card) {
        switch (card.getValue()) {
            case SKIP -> turnManager.skip();
            case REVERSE ->  turnManager.reverse();
            case DRAW_TWO -> {
                giveCards(turnManager.getNextPlayer(), 2);
                turnManager.skip();
            }
            case WILD_DRAW_FOUR -> {
                giveCards(turnManager.getNextPlayer(), 4);
                turnManager.skip();
            }
            default -> {}
        }
    }

    private void resolve(Card card) {
        applyEffect(card);
        if (getCurrentPlayer().getHand().isEmpty()) {
            phase = RoundPhase.ROUND_OVER;
        } else {
            finishTurn();
        }
    }

    private void finishTurn() {
        turnManager.endTurn();
        phase = RoundPhase.AWAITING_PLAY;
    }

    private void requiredPhase(RoundPhase expectedPhase) {
        if (phase != expectedPhase) {
            throw new IllegalStateException("Expected phase " + expectedPhase + " but got " + phase);
        }
    }

    private void giveCards(Player nextPlayer, int amount) {
        for (int i = 0; i < amount; i++) {
            nextPlayer.getHand().add(drawFromDeck());
        }
    }

    private Card drawFromDeck() {
        if(deck.isEmpty()) {
            deck.restock(discardPile.refilDeck());
        }
        return deck.draw();
    }

    private boolean isLegal(Card card) {
        return moveValidator.isLegalPlay(card, discardPile.getActiveColor());
    }


}
