package uno.cards;

import uno.game.Round;

public class SkipCard extends Card {

    public SkipCard(CardColor color) {
        super(color, CardValue.SKIP);
    }

    @Override
    void play() {

    }
}
