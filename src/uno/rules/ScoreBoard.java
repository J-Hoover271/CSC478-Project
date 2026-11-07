package uno.rules;

import uno.player.Player;

import java.util.ArrayList;
import java.util.Map;

public class ScoreBoard {
    private static int TARGET_SCORE = 500;
    private Map<Player, Integer> scores;

    public void addPoints(Player winner, ArrayList<Player> players) {
        for (Player player: players) {
            scores[winner] += player.getHand().getTotalPoints();
        }
    }

    public int getScore(Player player) {
        return scores[player];
    }


    public boolean hasWinner() {
        scores.forEach((key, value) -> {
            if (value >= 500) return true;
        });
    }

    public Player getWinner() {
        scores.forEach((key, value) -> {
            if (value >= 500) return key;
        });
    }
}
