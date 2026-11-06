package uno.cards;

public abstract class Card {
    private CardColor color;
    private CardValue value;

    Card(CardColor color, CardValue value) {
        this.color = color;
        this.value = value;
    }

    public CardColor getColor() {
        return color;
    }

    public CardValue getValue() {
        return value;
    }

    /*
    * This will be used for the scoring system that will happen
    * At the end of rounds
    */
    public int getPoints() {
        return CardPoints.getPoints(this.type);
    }

    public boolean isWild() {
        return this.value == CardValue.WILD || this.value == CardValue.WILD_DRAW_FOUR;
    }

    abstract void play();
}
