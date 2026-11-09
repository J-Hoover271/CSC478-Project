package uno.cards;

import uno.game.Round;

abstract public class Card {
    private final CardColor color;
    private final CardValue value;

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
        return CardPoints.INSTANCE.getPoints(this);
    }

    public boolean isWild() {
        return this.value == CardValue.WILD || this.value == CardValue.WILD_DRAW_FOUR;
    }

    abstract public void play(Round round);
}
