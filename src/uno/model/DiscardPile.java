package uno.model;

import uno.cards.Card;
import uno.cards.CardColor;

import java.util.ArrayList;

public class DiscardPile {
    private ArrayList<Card> cards;
    private CardColor activeColor;

    public DiscardPile() {

    }

    public void place(Card card) {
        cards.add(card);
    }

    public Card getTopCard() {
        return cards.get(cards.size() - 1);
    }

    public CardColor getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(CardColor activeColor) {
        this.activeColor = activeColor;
    }

    public ArrayList<Card> getAllExceptTop() {
        if (cards.size() <= 1) {
            return new ArrayList<>();
        }

        List<Card> cardsToRecycle =
                new ArrayList<>(cards.subList(0, cards.size() - 1));

        cards.subList(0, cards.size() - 1).clear();

        return cardsToRecycle;
    }
}
