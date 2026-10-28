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

    public int getPoints() {
        return 0;
    }

    public boolean isWild() {
        return false;
    }

    abstract void play();
}
