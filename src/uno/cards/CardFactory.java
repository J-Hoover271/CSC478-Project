package uno.cards;

public final class CardFactory {
    private CardFactory() {
    }

    public static Card createCard(CardColor color, CardValue value) {
        return switch (value) {
            case SKIP -> new SkipCard(color, value);
            case REVERSE -> new ReverseCard(color, value);
            case DRAW_TWO -> new DrawTwoCard(color, value);
            case WILD -> new WildCard(null, value);
            case WILD_DRAW_FOUR -> new WildDrawFourCard(null, value);
            default -> new NumberCard(color, value);
        };
    }
}
