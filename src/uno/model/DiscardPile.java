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

    }

    public Card getTopCard() {
        return null;
    }

    public CardColor getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(CardColor activeColor) {
        this.activeColor = activeColor;
    }

    public ArrayList<Card> refilDeck() {
        return null;
    }
}
