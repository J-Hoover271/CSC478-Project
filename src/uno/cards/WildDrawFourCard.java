package uno.cards;

import uno.game.Round;
import uno.player.Player;

public class WildDrawFourCard extends Card implements ColorDeclarable {

    public WildDrawFourCard() {
        super(CardColor.NONE, CardValue.WILD_DRAW_FOUR);
    }

    @Override
    public CardColor declareColor(Player player) {
        return player.promptForColor();
    }

    @Override
    public void play(Round round) {
        CardColor selectedColor = declareColor(round.getCurrentPlayer());
        Player nextPlayer = round.getNextPlayer();
        round.getDiscardPile.setActiveColor(selectedColor);
        nextPlayer.draw(4, round.getDeck());
        round.advanceTurn();
    }
}
