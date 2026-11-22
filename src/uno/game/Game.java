package uno.game;

import uno.player.Player;
import uno.rules.MoveValidator;
import uno.rules.ScoreBoard;

import java.util.List;

public class Game {
    private final List<Player> players;
    private final ScoreBoard scoreBoard;
    private final MoveValidator moveValidator;
    private Round currentRound;

    public Game(List<Player> players, ScoreBoard scoreBoard, MoveValidator moveValidator) {
        this.players = List.copyOf(players);
        this.scoreBoard = new ScoreBoard();
        this.moveValidator = new MoveValidator();
        startNextRound();
    }

    public void startNextRound() {
        currentRound = new Round(players, moveValidator);
    }

    public void endRound() {

    }

    public boolean isGameOver() {

    }

    public Player getWinner() {

    }

    public Round getCurrentRound() {
        return currentRound;
    }
}
