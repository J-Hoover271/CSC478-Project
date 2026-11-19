package uno.model;

import uno.cards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {
    private final List<Card> deck = new ArrayList<>();

    public Deck() {
        for (CardColor color : CardColor.COLORS) {
            deck.add(new NumberCard(color, CardValue.ZERO));
            for (int i = 0; i < 2; i++) {
                for (CardValue cardValue : CardValue.NUMBERS) {
                    deck.add(new NumberCard(color, cardValue));
                }
                deck.add(new SkipCard(color));
                deck.add(new ReverseCard(color));
                deck.add(new DrawTwoCard(color));
            }
        }
        for (int i = 0; i < 4; i++) {
            deck.add(new WildCard());
            deck.add(new WildDrawFourCard());
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card draw() {
        return deck.remove(deck.size() - 1);
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public void restock(List<Card> playedCards) {
        deck.addAll(playedCards);
        this.shuffle();
    }

    public int size() {
        return deck.size();
    }

    public String displayDeck() {
        int itemsPerLine = 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deck.size(); i++) {
            sb.append(deck.get(i));

            if ((i + 1) % itemsPerLine == 0) {
                sb.append(System.lineSeparator());
            } else if (i < deck.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CardColor color : CardColor.COLORS) {
            sb.append(color).append(": ");

            for (Card card : deck) {
                if (card.getColor() == color) {
                    sb.append(card).append(", ");
                }
            }
            sb.append(System.lineSeparator());
        }

        sb.append("WILD: ");
        for (Card card : deck) {
            if (card.getColor() == CardColor.NONE) {
                sb.append(card).append(", ");
            }
        }

        return sb.toString();
    }
}
