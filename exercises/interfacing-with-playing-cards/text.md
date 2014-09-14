In order for my cards to work with your cards, they've got to be the same *type* of cards. How do we pull that off? With an <word data-key="interface">interface</word>, which is a simple way for students to use an object – in this case, a card – without needing to know how it's implemented or works.

The iCard interface specifies the behavior of the card without providing information about how cards are implemented:

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

The ICard interface specifies the behavior of cards without providing information about their implementation. That's enough for us to do things with them like, for example, tell us if a list of cards is sorted:

    public boolean isSorted(ICard[] deck){
        for(int i = 1; i < deck.length; i++){
            if(deck[i - 1].compareTo(deck[k]) > 0){
                return false;
            }
        }
        return true;
    }