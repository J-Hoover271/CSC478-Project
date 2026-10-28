package uno.game;

import uno.model.Deck;
import uno.model.DiscardPile;
import uno.player.Player;

import java.util.ArrayList;

public class Round {
    private ArrayList<Player> players;
    private Deck deck;
    private DiscardPile discardPile;
    private Direction direction;
}
