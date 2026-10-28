package uno.player;

public class AIPlayer extends Player {

    public AIPlayer(String name) {
        super(name);
    }

    @Override
    boolean isHuman() {
        return false;
    }
}
