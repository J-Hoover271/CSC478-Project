package uno.model;

import uno.cards.Card;

import java.util.ArrayList;

import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        for (CardColor color : colors) {
            if (color == CardColor.NONE) {
                // Add four WILD and four WILD_DRAW_FOUR cards
                cards.add(new Card(CardColor.NONE, CardValue.WILD));
                cards.add(new Card(CardColor.NONE, CardValue.WILD));
                cards.add(new Card(CardColor.NONE, CardValue.WILD));
                cards.add(new Card(CardColor.NONE, CardValue.WILD));
                cards.add(new Card(CardColor.NONE, CardValue.WILD_DRAW_FOUR));
                cards.add(new Card(CardColor.NONE, CardValue.WILD_DRAW_FOUR));
                cards.add(new Card(CardColor.NONE, CardValue.WILD_DRAW_FOUR));
                cards.add(new Card(CardColor.NONE, CardValue.WILD_DRAW_FOUR));
                continue;
            }

            // One ZERO card per color
            cards.add(new Card(color, CardValue.ZERO));

            // Two of each number ONE through NINE
            for (int i = CardValue.ONE.ordinal(); i <= CardValue.DRAW_TWO.ordinal(); i++) {
                CardValue value = CardValue.values()[i];

                cards.add(new Card(color, value));
                cards.add(new Card(color, value));
            }
        }
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
