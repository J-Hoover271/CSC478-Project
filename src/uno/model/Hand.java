package uno.model;

import uno.cards.Card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {

    }

    public void add(Card card) {
        cards.add(card);
    }

    public void remove(Card card) {
        cards.remove(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getTotalPoints() {
        int totalPoints = 0;
        for (Card card : cards) {
            totalPoints += card.getPoints();
        }
        return totalPoints;
    }

    public int size() {
        return cards.size();
    }

    public boolean isEmpty() {
        cards.isEmpty()
    }
}
