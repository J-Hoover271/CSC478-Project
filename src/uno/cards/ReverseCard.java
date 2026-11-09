package uno.cards;

import uno.game.Direction;
import uno.game.Round;

public class ReverseCard extends Card{

    ReverseCard(CardColor color, CardValue value) {
        super(color, value);
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
