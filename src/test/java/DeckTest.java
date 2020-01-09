import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
       deck = new Deck();
    }

    @Test
    public void deckShouldStartEmpty(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void deckCanBePopulated(){
        deck.populateDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void deckCanBeShuffled(){
        deck.populateDeck();
        Card firstCard = deck.getCard(0);
        deck.shuffleCards();
        Card shuffledFirstCard = deck.getCard(0);
        assertNotEquals(firstCard, shuffledFirstCard);
    }

    @Test
    public void cardCanBeDealt(){
        deck.populateDeck();
        deck.shuffleCards();
        Card dealtCard = deck.dealCard();
        assertNotNull(dealtCard);
        assertEquals(51, deck.countCards());

    }
}
