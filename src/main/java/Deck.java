import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return cards.size();
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit,rank);
                cards.add(card);
            }
        }
    }

    public Card getCard(int i) {
        return cards.get(i);
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }
}
