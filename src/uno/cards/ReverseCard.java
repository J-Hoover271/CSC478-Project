package uno.cards;

public class ReverseCard extends Card{

    public ReverseCard(CardColor color) {
        super(color, CardValue.REVERSE);
    }

    @Override
    public void play(CardEffectContext ctx) {
        ctx.reverseDirection();
    }


}
