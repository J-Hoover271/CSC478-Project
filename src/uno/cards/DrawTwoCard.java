package uno.cards;

import uno.game.Round;
import uno.player.Player;

public class DrawTwoCard extends Card {

    DrawTwoCard(CardColor color, CardValue value) {
        super(color, value);
    }

    @Override
    public void play(Round round) {
        Player nextPlayer = round.getNextPlayer();
        nextPlayer.draw(2, round.getDeck());
        round.advanceTurn();
    }


}
