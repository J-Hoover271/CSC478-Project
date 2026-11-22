package uno.cards;

public class DrawTwoCard extends Card {

    public DrawTwoCard(CardColor color) {
        super(color, CardValue.DRAW_TWO);
    }

    @Override
    public void play(CardEffectContext ctx) {
        ctx.nextPlayerDraws(2);
        ctx.skipNextPlayer();
    }


}
