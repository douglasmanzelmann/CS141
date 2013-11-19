/**
 * Created with IntelliJ IDEA.
 * User: dmanzelmann
 * Date: 11/15/13
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class SixPoint24 {
    public static void main(String[] args) {
        int[] deck = createDeck();
        shuffleCards(deck);
        findFourCardsOfEachSuit(deck);

    }

    public static int[] createDeck() {
        int[] deck = new int[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        return deck;
    }

    public static void shuffleCards(int[] cards) {
        for (int i = 0; i <= cards.length -1; i++) {
            int index = (int)(Math.random() * cards.length);
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }

    public static void findFourCardsOfEachSuit(int[] deck) {
        int clubs = 0;
        int spades = 0;
        int hearts = 0;
        int diamonds = 0;
        int i = 0;

        while ((clubs <= 4) && (spades <= 4) && (hearts <= 4) && (diamonds <= 4)) {
            if (deck[i] / 13 == 1)
                clubs++;
            else if (deck[i] / 13 == 2)
                spades++;
            else if (deck[i] / 13 == 3)
                hearts++;
            else if (deck[i] / 13 == 4)
                diamonds++;

            i++;
        }

        System.out.println("It took " + i + " cards to find four from each suit.");
    }
}
