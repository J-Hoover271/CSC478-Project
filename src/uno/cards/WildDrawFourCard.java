package uno.cards;

public class WildDrawFourCard extends Card {

    public WildDrawFourCard() {
        super(CardColor.NONE, CardValue.WILD_DRAW_FOUR);
    }


    @Override
    public void play(CardEffectContext ctx) {
        ctx.nextPlayerDraws(4);
        ctx.skipNextPlayer();
    }
}
