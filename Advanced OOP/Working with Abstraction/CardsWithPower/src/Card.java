public class Card {
    private CardRanks rank;
    private CardSuits suit;
    private int powerOfCard;

    public Card(CardSuits _s,CardRanks _r) {
        this.suit = _s;
        this.rank = _r;
    }

    int getPowerOfCard() {
        return powerOfCard = this.suit.getPower() + this.rank.getIndex();
    }
}
