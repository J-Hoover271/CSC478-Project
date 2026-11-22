package uno.cards;

public class NumberCard extends Card {
    public NumberCard(CardColor color, CardValue cardValue) {
        super(color, cardValue);
    }

    @Override
    public void play(CardEffectContext ctx) { }
}
