package uno.cards;

public class CardPoints {

    private static final Map<CardType, Integer> POINTS =
            Map.of(
                    CardType.ZERO, 0,
                    CardType.ONE, 1,
                    CardType.TWO, 2,
                    CardType.THREE, 3,
                    CardType.FOUR, 4,
                    CardType.FIVE, 5,
                    CardType.SIX, 6,
                    CardType.SEVEN, 7,
                    CardType.EIGHT, 8,
                    CardType.NINE, 9,
                    SKIP, 20,
                    REVERSE, 20,
                    DRAW_TWO, 20,
                    WILD, 50,
                    WILD_DRAW_FOUR, 50,
            );

    public static int getPoints(CardType type) {
        return POINTS.get(type);
    }
}