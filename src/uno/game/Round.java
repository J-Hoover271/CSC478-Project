package uno.game;

import uno.model.Deck;
import uno.model.DiscardPile;
import uno.player.Player;
import uno.game.TurnController;

import java.util.ArrayList;

public class Round {
    private TurnController turnController;
    private Deck deck;
    private DiscardPile discardPile;

    Round(ArrayList<Player> players) {
        this.turnController = new TurnController(players);
        this.discardPile = new DiscardPile();
        this.deck = new Deck();
    }
}
