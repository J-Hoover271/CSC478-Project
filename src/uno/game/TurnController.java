import uno.Direction;
import java.lang.Math;

public class TurnController {
    private final ArrayList<Player> players;
    private int currentIndex = 0;
    private boolean direction = Direction.CLOCKWISE;

    public TurnController(List<Player> players) {
        if (players == null || players.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one player.");
        }
        // List.copyOf creates an unmodifiable copy
        this.players = List.copyOf(players);
    }

    public Player getCurrentPlayer() {
        return players.get(currentIndex);
    }

    public nextTurn() {
        int step = 1;
        if (direction == Direction.COUNTER_CLOCKWISE) {
            step = -1;
        }
        currentIndex = Math.floorMod(currentIndex + step, players.size());
    }

    public void reverse() {
        if (direction == Direction.CLOCKWISE) {
            direction = Direction.COUNTER_CLOCKWISE;
        } else {
            direction = Direction.CLOCKWISE;
        }
    }
}