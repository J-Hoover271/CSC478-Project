package uno.model;

import uno.cards.Card;
import uno.cards.CardColor;
import uno.game.Round;

import java.util.ArrayList;
import java.util.List;

public class DiscardPile {
    private List<Card> discardPile = new ArrayList<>();
    private Card topCard;
    private CardColor activeColor;

    public DiscardPile(Deck deck) {
        topCard = deck.draw();
        discardPile.add(topCard);
    }

    public void place(Card card) {
        discardPile.add(card);
        topCard = card;
    }

    public List<Card> getDiscardPile() {
        return discardPile;
    }

    public Card getTopCard() {
        return topCard;
    }

    public CardColor getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(CardColor activeColor) {
        this.activeColor = activeColor;
    }

    public List<Card> refillDeck() {
        ArrayList<Card> cards = new ArrayList<>();
        for (Card card : discardPile) {
            if (card != topCard) {
                cards.add(card);
            }
        }
        discardPile.clear();
        discardPile.add(topCard);
        return cards;
    }

    public String displayDiscardPile(){
        int itemsPerLine = 10;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < discardPile.size(); i++){
            sb.append(discardPile.get(i));

            if((i + 1) % itemsPerLine == 0){
                sb.append(System.lineSeparator());
            } else if (i < discardPile.size() - 1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
