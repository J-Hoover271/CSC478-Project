package uno.cards;

public interface CardEffectContext {
    void skipNextPlayer();
    void reverseDirection();
    void nextPlayerDraws(int count);
}
