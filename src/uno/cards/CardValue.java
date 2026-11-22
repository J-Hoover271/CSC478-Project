package uno.cards;

import java.util.List;

public enum CardValue {
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    SKIP("Skip"),
    REVERSE("Reverse"),
    DRAW_TWO("+2"),
    WILD("Wild"),
    WILD_DRAW_FOUR("Wild +4");

    private final String label;

    CardValue(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static final List<CardValue> NUMBERS = List.of(ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE);
}
