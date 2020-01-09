public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;
    }


    public Object getSuit() {
        return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }
}
