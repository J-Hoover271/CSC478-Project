package uno.player;

import uno.model.Hand;

public abstract class Player {
    protected String name;
    protected Hand hand;

    public Player(String name) {

    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    abstract boolean isHuman();
}
