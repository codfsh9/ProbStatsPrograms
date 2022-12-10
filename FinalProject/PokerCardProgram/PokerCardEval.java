import java.util.ArrayList;

public class PokerCardEval {

    public void pokerHandEval() {
        // Counters for different hands to win
        int flushWins = 0, pairWins = 0, twoPairs = 0, threeOfAKind = 0, fourOfAKind = 0, straightWins = 0,
                straightFlushWins = 0, fullHouseWins = 0, royalFlushWins = 0, highCard = 0;

        int trials = 100000;


        for (int i = 0; i < trials; i++) {
            PokerDeck Deck = new PokerDeck();
            ArrayList<PokerCard> hand = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                hand.add(Deck.drawRandomCard());
            }
            if (Deck.evalFlush(hand)) {
                //System.out.println(hand + " *Flush");
                flushWins++;
            }
            if (Deck.evalPair(hand)) {
                //System.out.println(hand + " *One Pair");
                pairWins++;
            }

            if (Deck.evalTwoPair(hand)) {
                //System.out.println(hand + " *Two Pair");
                twoPairs++;
            }

            if (Deck.evalThreeOfAKind(hand)) {
                //System.out.println(hand + " *Three of a Kind");
                threeOfAKind++;
            }

            if (Deck.evalFourOfAKind(hand)) {
                //System.out.println(hand + " *Four of a kind");
                fourOfAKind++;
            }

            if (Deck.evalStraight(hand)) {
                //System.out.println(hand + " *Straight");
                straightWins++;
            }
            if (Deck.evalFullHouse(hand)) {
                //System.out.println(hand + " *Full house");
                fullHouseWins++;
            }
            if (Deck.evalStraightFlush(hand)) {
                //System.out.println(hand + " *Straight Flush");
                straightFlushWins++;
            }
            if (Deck.evalRoyalFlush(hand)) {
                System.out.println(hand + " *Royal Flush");
                royalFlushWins++;
            } else if (!(Deck.evalFlush(hand) || Deck.evalPair(hand) || Deck.evalThreeOfAKind(hand) ||
                    Deck.evalFourOfAKind(hand) || Deck.evalStraight(hand) || Deck.evalFullHouse(hand)) ||
                    Deck.evalRoyalFlush(hand)) {
                //System.out.println(hand + " High Card");
                highCard++;
            }
        }

        // Print out the probabilities of hands in the deck along with the expected.
        System.out.println("\nProbability of a Flush(Expected 0.1965%): " + (flushWins / (1.0 * trials)) * 100 + "%");
        System.out.println("Probability of a Pair(Expected 42.2569%): " + (pairWins / (1.0 * trials)) * 100 + "%");
        System.out.println("Probability of a Two Pairs(Expected 4.7539%): " + (twoPairs / (1.0 * trials)) * 100 + "%");
        System.out.println("Probability of a Three of a Kind(Expected 2.1128%): " + (threeOfAKind / (1.0 * trials)) * 100 + "%");
        System.out.println("Probability of a Four of a kind(Expected 0.02401%): " + (fourOfAKind / (1.0 * trials)) * 100 + "%");
        System.out.println("Probability of a Straight(Expected 0.3925%): " + (straightWins / (1.0 * trials)) * 100 + "%");
        System.out.println("Probability of a Straight Flush(Expected 0.00139%): " + ((1.0 * straightFlushWins / (1.0 * trials)) * 100) + "%");
        System.out.println("Probability of a Full House(Expected 0.1141%): " + (fullHouseWins / (1.0 * trials)) * 100 + "%");
        System.out.println("Probability of a Royal Flush(Expected 0.000154%%): " + (royalFlushWins / (1.0 * trials)) * 100 + "%");
        System.out.println("Probability of a High Card(Expected 50.117%): " + (highCard / (1.0 * trials)) * 100 + "%");

        System.out.println("trials " + trials);

    }

}
