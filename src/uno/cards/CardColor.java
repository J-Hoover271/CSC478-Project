package uno.cards;

import java.util.List;

public enum CardColor {
    RED("Red"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    GREEN("Green"),
    NONE("");

    private final String label;

    CardColor(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static final List<CardColor> COLORS = List.of(RED, YELLOW, BLUE, GREEN);
}
