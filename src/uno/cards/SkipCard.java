package uno.cards;

import uno.game.Round;

public class SkipCard extends Card {

    public SkipCard(CardColor color, CardValue value) {
        super(color, value);
    }

    @Override
    public void play(Round round) {
        round.advanceTurn();
    }


}
