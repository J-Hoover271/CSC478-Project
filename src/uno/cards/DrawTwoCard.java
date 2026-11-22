package uno.cards;

import uno.game.Round;
import uno.player.Player;

public class DrawTwoCard extends Card {

    public DrawTwoCard(CardColor color) {
        super(color, CardValue.DRAW_TWO);
    }

    @Override
    public void play(Round round) {
        Player nextPlayer = round.getNextPlayer();
        nextPlayer.draw(2, round.getDeck());
        round.advanceTurn();
    }


}
