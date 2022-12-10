import java.util.ArrayList;
public class PokerCardTest {
    public static void main(String[] args) {
	    PokerDeck pd = new PokerDeck();
        ArrayList<PokerCard> cards = pd.getDeck();

		//Display the cards from a full deck (52)
	    System.out.println(cards.size() + " cards.");
        System.out.println(cards);

		//Draw 5 cards from the deck
	    ArrayList<PokerCard> hand = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			hand.add(pd.drawRandomCard());
		}

		//Show how many cards are left after pulling a hand
		System.out.println(cards.size() + " cards left in deck.");
		System.out.println(cards);

		System.out.println("\nHand: " + hand + "\n");

		//Call the method from PokerCardEval to evaluate the card hand probabilities
        PokerCardEval eval = new PokerCardEval();
        eval.pokerHandEval();

		//Call the method from PokerCardTwoPlayer class to have two hands compared
		PokerCardTwoPlayer tp = new PokerCardTwoPlayer();
		tp.pokerCardTwoPlayer();
    }
}
