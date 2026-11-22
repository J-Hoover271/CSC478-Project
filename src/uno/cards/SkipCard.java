package uno.cards;

import uno.game.Round;

public class SkipCard extends Card {

    public SkipCard(CardColor color) {
        super(color, CardValue.SKIP);
    }

    @Override
    public void play(CardEffectContext ctx) {
        ctx.skipNextPlayer();
    }
}
