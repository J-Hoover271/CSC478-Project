package uno.game;

import uno.player.Player;

import java.util.List;

public class TurnManager {
    private List<Player> players;
    private int currentIndex;
    private Direction direction;
    private int skips;

    public TurnManager(List<Player> players, int startIndex) {
        if (players.size() < 2) {
            throw new IllegalArgumentException("There must be at least two players");
        }
        this.players = List.copyOf(players);
        this.currentIndex = Math.floorMod(startIndex, players.size());
        this.direction = Direction.CLOCKWISE;
        this.skips = 0;
    }

    public TurnManager(List<Player> players) {
        this(players, 0);
    }

    public Player getCurrentPlayer() {
        return players.get(currentIndex);
    }

    public Player getNextPlayer() {
        return players.get(nextSeat(currentIndex, 1));
    }

    public Direction getDirection() {
        return direction;
    }

    public void reverse() {
        direction = (direction == Direction.CLOCKWISE) ? Direction.COUNTER_CLOCKWISE : Direction.CLOCKWISE;
        skip();
    }

    public void skip() {
        skips++;
    }

    public void endTurn() {
        currentIndex = nextSeat(currentIndex, 1 + skips);
        skips = 0;
    }

    public int nextSeat(int currentSeat, int steps) {
        int sign = (direction == Direction.CLOCKWISE) ? 1 : -1;
        return Math.floorMod(currentSeat + steps * sign, players.size());
    }
}
