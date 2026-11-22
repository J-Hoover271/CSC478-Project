package uno.app;

import uno.game.Round;
import uno.model.Deck;
import uno.model.DiscardPile;
import uno.model.Hand;
import uno.player.HumanPlayer;
import uno.player.Player;
import uno.rules.MoveValidator;

import java.util.ArrayList;
import java.util.List;

public class main {
    static void main(String[] args) {
        Player p1 = new HumanPlayer("p1");
        Player p2 = new HumanPlayer("p2");
        Player p3 = new HumanPlayer("p3");
        Player p4 = new HumanPlayer("p4");
        MoveValidator moveValidator = new MoveValidator();

        List<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);

        Round round = new Round(players, moveValidator);


    }
}
