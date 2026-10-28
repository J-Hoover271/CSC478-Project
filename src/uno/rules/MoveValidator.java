package uno.rules;

import uno.cards.Card;
import uno.cards.CardColor;
import uno.model.Hand;

public class MoveValidator {

    public boolean isLegalPlay(Card card, CardColor color) {
        return false;
    }

    public boolean hasPlayableCard(Hand hand, Card top, CardColor color) {
        return false;
    }
}
