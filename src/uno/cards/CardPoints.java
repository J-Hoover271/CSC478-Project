package uno.cards;

import java.util.Map;

public enum CardPoints {
    INSTANCE;

    private final Map<CardValue, Integer> pointValues = Map.ofEntries(
            Map.entry(CardValue.ZERO, 0),
            Map.entry(CardValue.ONE, 1),
            Map.entry(CardValue.TWO, 2),
            Map.entry(CardValue.THREE, 3),
            Map.entry(CardValue.FOUR, 4),
            Map.entry(CardValue.FIVE, 5),
            Map.entry(CardValue.SIX, 6),
            Map.entry(CardValue.SEVEN, 7),
            Map.entry(CardValue.EIGHT, 8),
            Map.entry(CardValue.NINE, 9),
            Map.entry(CardValue.SKIP, 20),
            Map.entry(CardValue.REVERSE, 20),
            Map.entry(CardValue.DRAW_TWO, 20),
            Map.entry(CardValue.WILD, 50),
            Map.entry(CardValue.WILD_DRAW_FOUR, 50)
    );

    public int getPoints(Card card) {
        if(card == null) {
            return 0;
        }
        return pointValues.get(card.getValue());
    }
}
