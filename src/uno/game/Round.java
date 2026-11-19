package uno.game;

import uno.model.Deck;
import uno.model.DiscardPile;
import uno.player.Player;
import uno.game.TurnController;
import uno.model.Hand;

import java.util.ArrayList;

public class Round {
    private TurnController turnController;
    private Deck deck;
    private DiscardPile discardPile;
    private ArrayList<Player> players;

    Round(ArrayList<Player> players) {
        this.players = players;
        this.turnController = new TurnController(players);
        this.discardPile = new DiscardPile();
        this.deck = new Deck();
        deal();
    }

    private deal() {
        // shuffle
        deck.shuffle();
        // deal all hands
        for (Player player : players) {
            Hand hand = new Hand();

            for (int i = 0; i < 7; i++) {
                hand.add(deck.draw());
            }

            player.setHand(hand);
        }

        // add card to discard pile
        discardPile.place(deck.draw());
    }


}
