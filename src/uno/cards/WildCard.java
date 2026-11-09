package uno.cards;

import uno.game.Round;
import uno.player.Player;

public class WildCard extends Card implements ColorDeclarable {
    WildCard(CardColor color, CardValue value) {
        super(color, value);
    }

    @Override
    public CardColor declareColor(Player player) {
        return player.promptForColor();
    }

    @Override
    public void play(Round round) {
        CardColor selectedColor = declareColor(round.getCurrentPlayer());
        round.getDiscardPile().setActiveColor(selectedColor);
    }


}
