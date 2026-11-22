package uno.cards;

abstract public class Card {
    private final CardColor color;
    private final CardValue value;

    Card(CardColor color, CardValue value) {
        this.color = color;
        this.value = value;
    }

    public abstract void play(CardEffectContext ctx);

    public CardColor getColor() {
        return color;
    }

    public CardValue getValue() {
        return value;
    }

    public int getPoints() {
        return CardPoints.INSTANCE.getPoints(this);
    }

    public boolean isWild() {
        return this.value == CardValue.WILD || this.value == CardValue.WILD_DRAW_FOUR;
    }

    public String toString() {
        if(color == CardColor.NONE) {
            return value.getLabel();
        }
        return color.getLabel() + " " + value.getLabel();
    }
}
