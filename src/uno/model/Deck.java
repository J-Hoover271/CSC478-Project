package uno.model;

import uno.cards.Card;

import java.util.ArrayList;

import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {

    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    // remove(int index) returns the removed object
    // if this is ever changed to remove(Object o)
    // keep in mind that remove(Object o) does not return the removed element
    public Card draw() {
        if (cards.isEmpty()) {
            restock();
        }
        return cards.remove(cards.size() - 1);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    // to be used for restocking the deck from the drawpile
    public void addCards(List<Card> cards) {
        this.cards.addAll(cards);
    }
}
