package uno.model;

import uno.cards.Card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();

    public Hand() {

    }

    public void add(Card card) {
        hand.add(card);
    }

    public void remove(Card card) {
        hand.remove(card);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getTotalPoints() {
        int points = 0;
        for (Card card : hand) {
            points += card.getPoints();
        }
        return points;
    }

    public int size() {
        return hand.size();
    }

    public boolean isEmpty() {
        return hand.isEmpty();
    }

    public void clear() {
        hand.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < hand.size(); i++) {
            sb.append(hand.get(i));
            if(i < hand.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
