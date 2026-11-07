package uno.rules;

import uno.cards.Card;
import uno.cards.CardColor;
import uno.model.Hand;
import uno.DiscardPile;

public class MoveValidator {

    static public boolean isLegalPlay(Card card) {
        if (card.getColor() == CardColor.NONE) return true;
        if (card.getColor() == DiscardPile.getActiveColor()) return true;
        if (card.getValue() == DiscardPile.getTopCard().getValue()) return true;
        return false;
    }

    static public boolean hasPlayableCard(Hand hand, Card top, CardColor color) {
        ArrayList<Card> cards = hand.getCards();
        for (Card card : cards) {
            if isLegalPlay(card) return true;
        }
        return false;
    }
}
