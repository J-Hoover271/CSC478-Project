package uno.cards;

import uno.game.Direction;
import uno.game.Round;

public class ReverseCard extends Card{

    public ReverseCard(CardColor color) {
        super(color, CardValue.REVERSE);
    }

    @Override
    public void play(Round round) {
        if(round.getDirection() == Direction.CLOCKWISE) {
            round.setDirection(Direction.COUNTER_CLOCKWISE);
        } else {
            round.setDirection(Direction.CLOCKWISE);
        }
    }


}
