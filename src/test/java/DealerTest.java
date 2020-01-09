import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealerTest {

    private Dealer dealer;
    private Deck deck;
    private Player player1;

    @Before
    public void before(){
        dealer = new Dealer();
        deck = new Deck();
        player1 = new Player();
        deck.populateDeck();
        deck.shuffleCards();
    }

    @Test
    public void dealerHasCards(){
        dealer.setDeck(deck);
        assertEquals(52, dealer.getDeck().countCards());
    }

    @Test
    public void dealerCanDeal(){
        dealer.setDeck(deck);
        dealer.dealCards(player1);
        assertNotNull(player1.getCard());
    }
}
