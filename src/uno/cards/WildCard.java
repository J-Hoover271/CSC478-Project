package uno.cards;

public class WildCard extends Card {

    public WildCard() {
        super(CardColor.NONE, CardValue.WILD);
    }

    @Override
    public void play(CardEffectContext ctx) { }
}
