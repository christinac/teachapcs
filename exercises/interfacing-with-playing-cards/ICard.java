public interface ICard extends Comparable{
    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS = 3;

    // returns a value like ICard.SPADES
    public int getSuit();

    // returns a value between 1 (ace) and 13 (king)
    public int getRank();
}
