import java.util.ArrayList;

public class PokerCardTwoPlayer {

    public void pokerCardTwoPlayer() {
        //Ranking
        int onePair = 1, twoPair = 2, threePair = 3, straight = 4, flush = 5, fullHouse = 6, fourPair = 7,
                straightFlush = 8, royalFlush = 9;
        //Hold totals for player one and two to determine victor
        int total1 = 0, total2 = 0;

        //Create deck
        PokerDeck pd = new PokerDeck();

        //Create hand for player one
        ArrayList<PokerCard> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(pd.drawRandomCard());
        }

        //Display hand 1
        System.out.println("\nHand 1: " + hand);

        //Evaluate hand 1 and determine rank
        if (pd.evalPair(hand)) {
            System.out.println(" *One Pair");
            total1 += onePair;
        }
        if (pd.evalTwoPair(hand)) {
            System.out.println(" *Two Pair");
            total1 += twoPair;
        }
        if (pd.evalThreeOfAKind(hand)) {
            System.out.println(" *Three of a kind");
            total1 += threePair;
        }
        if (pd.evalFourOfAKind(hand)) {
            System.out.println(" *Four of a kind");
            total1 += fourPair;
        }
        if (pd.evalStraight(hand)) {
            System.out.println(" *Straight");
            total1 += straight;
        }
        if (pd.evalFlush(hand)) {
            System.out.println(" *Flush");
            total1 += flush;
        }
        if (pd.evalFullHouse(hand)) {
            System.out.println(" *Full House");
            total1 += fullHouse;
        }
        if (pd.evalStraightFlush(hand)) {
            System.out.println(" *Straight Flush");
            total1 += straightFlush;
        }
        if (pd.evalRoyalFlush(hand)) {
            System.out.println(" *Royal Flush");
            total1 += royalFlush;
        }

        //Create hand for player two
        ArrayList<PokerCard> hand2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand2.add(pd.drawRandomCard());
        }

        //Display hand 2
        System.out.println("\nHand 2: " + hand2);

        //Evaluate hand 2 and determine rank
        if (pd.evalPair(hand2)) {
            System.out.println(" *One Pair");
            total2 += onePair;
        }
        if (pd.evalTwoPair(hand2)) {
            System.out.println(" *Two Pair");
            total2 += twoPair;
        }
        if (pd.evalThreeOfAKind(hand2)) {
            System.out.println(" *Three of a kind");
            total2 += threePair;
        }
        if (pd.evalFourOfAKind(hand2)) {
            System.out.println(" *Four of a kind");
            total2 += fourPair;
        }
        if (pd.evalStraight(hand2)) {
            System.out.println(" *Straight");
            total2 += straight;
        }
        if (pd.evalFlush(hand2)) {
            System.out.println(" *Flush");
            total2 += flush;
        }
        if (pd.evalFullHouse(hand2)) {
            System.out.println(" *Full House");
            total2 += fullHouse;
        }
        if (pd.evalStraightFlush(hand2)) {
            System.out.println(" *Straight Flush");
            total2 += straightFlush;
        }
        if (pd.evalRoyalFlush(hand2)) {
            System.out.println(" *Royal Flush");
            total2 += royalFlush;
        }

        //Determine if player one or player two has won depending on their ranking
        if (total1 > total2)
        {
            System.out.println("Hand 1 Wins");
        } else if (total2 > total1) {
            System.out.println("Hand 2 Wins");
        }
        else
        {
            System.out.println("It is a draw");
        }


    }

}
