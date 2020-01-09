public class Dealer {

    private Deck deck;

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void dealCards(Player player) {
        Card dealtCard = deck.dealCard();
        player.setCard(dealtCard);
    }
}
