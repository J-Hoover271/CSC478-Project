package uno.game;

import uno.player.Player;
import uno.rules.MoveValidator;
import uno.rules.ScoreBoard;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private ScoreBoard scoreBoard;
    private MoveValidator moveValidator;
    private Round currentRound;

    public Game() {

    }
}
