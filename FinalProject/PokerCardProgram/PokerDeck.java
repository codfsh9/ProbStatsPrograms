import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PokerDeck {

    private final ArrayList<PokerCard> deck;

    public PokerDeck() {
        deck = new ArrayList<>();

        for (int i = 0; i < 13; i++) { // Represents the numbers

            for (int j = 0; j < 4; j++) { // Represents the suite
                PokerCard temp = new PokerCard(j, i);
                deck.add(temp);
            }
        }
    }

    //Method to evaluate a flush hand
    public boolean evalFlush(ArrayList<PokerCard> hand) {
        int suite = -1;
        // Loop to go through cards
        for (PokerCard singleCard : hand) {
            // tempSuit is set to the value of suite of current card
            int tempSuite = singleCard.getSuite();
            // Runs at least once
            if (suite == -1) {
                suite = tempSuite;
            } else if (suite != tempSuite) {
                return false;
            }
        }
        return true;
    }

    //Method to evaluate a one pair
    public boolean evalPair(ArrayList<PokerCard> hand) {
        int[] cardCount = new int[13];
        int[] temp = new int[hand.size()];
        int i = 0;

        // Indexes card number into appropriate index of 0-12(card number) by
        // incrementing the index by 1
        for (PokerCard singleCard : hand) {
            temp[i] = singleCard.getNumber();
            int index = temp[i] % 13;
            cardCount[index]++;
            i += 1;
        }


        // Goes through the cardCount array to see if there are any pairs goes through
        // the array and find if an element equals to 2 and only 2

        for (int k : cardCount) {
            if (k == 2) {
                return true;
            }
        }

        return false;
    }

    //Method to evaluate a two pair
    public boolean evalTwoPair(ArrayList<PokerCard> hand) {
        int[] cardCount = new int[13];
        int[] temp = new int[hand.size()];
        int i = 0;
        int count = 0;

        // Indexes card number into appropriate index of 0-12(card number) by
        // incrementing the index by 1
        for (PokerCard singleCard : hand) {
            temp[i] = singleCard.getNumber();
            int index = temp[i] % 13;
            cardCount[index]++;
            i += 1;
        }


        // Goes through the cardCount array to see if there are any pairs then
        // increments count to by 1 If count reaches 2 then there is 2 pairs in the hand

        for (int k : cardCount) {
            if (k == 2) {
                count++;
            }
            if (count == 2) {
                return true;
            }
        }

        return false;
    }

    //Method to evaluate a Three of a kind
    public boolean evalThreeOfAKind(ArrayList<PokerCard> hand) {
        int[] cardCount = new int[13];
        int[] temp = new int[hand.size()];
        int i = 0;

        // Indexes card number into appropriate index of 0-12(card number) by
        // incrementing the index by 1
        for (PokerCard singleCard : hand) {
            temp[i] = singleCard.getNumber();
            int index = temp[i] % 13;
            cardCount[index]++;
            i += 1;
        }


        // Goes through the cardCount array to see if this a three of a kind then goes
        // through the array and find if an element equals 3 and only 3

        for (int j : cardCount) {
            if (j == 3) {
                return true;
            }
        }

        return false;
    }

    //Method to evaluate a Four of a kind
    public boolean evalFourOfAKind(ArrayList<PokerCard> hand) {
        int[] cardCount = new int[13];
        int[] temp = new int[hand.size()];
        int i = 0;

        // Indexes card number into appropriate index of 0-12(card number) and
        // goes through the array and find if an element equals to 4 and only 4
        for (PokerCard singleCard : hand) {
            temp[i] = singleCard.getNumber();
            int index = temp[i] % 13;
            cardCount[index]++;
            i += 1;
        }


        // Goes through the cardCount array to see if there is a Four of a kind it will
        // return true is there is a 4 in the array

        for (int k : cardCount) {
            if (k == 4) {
                return true;
            }
        }

        return false;
    }

    //Method to evaluate a Straight hand
    public boolean evalStraight(ArrayList<PokerCard> hand) {
        int[] temp = new int[hand.size()];
        int i = 0;

        for (PokerCard singleCard : hand) {
            temp[i] = singleCard.getNumber();
            i += 1;
        }

        Arrays.sort(temp);

        for (int j = 0; j < hand.size() - 1; j++) {
            if (temp[j] - temp[j + 1] != -1) {
                return false;
            }
        }
        return true;
    }

    //Method to evaluate a Full House
    public boolean evalFullHouse(ArrayList<PokerCard> hand) {
        if (evalThreeOfAKind(hand) && evalPair(hand)) {
            return true;
        }
        return false;
    }

    //Method to evaluate a Straight Flush
    public boolean evalStraightFlush(ArrayList<PokerCard> hand) {

        return evalFlush(hand) && evalStraight(hand);
    }

    //Method to evaluate a Royal Flush
    public boolean evalRoyalFlush(ArrayList<PokerCard> hand) {
        if (evalFlush(hand)) {
            int[] temp = new int[hand.size()];
            int i = 0;

            for (PokerCard singleCard : hand) {
                temp[i] = singleCard.getNumber();
                i += 1;
            }

            Arrays.sort(temp);

            for (int j = 1; j < hand.size() - 1; j++) {
                if (temp[0] != 0 || temp[1] != 9 || temp[j] - temp[j + 1] != -1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //Method to return the card deck
    public ArrayList<PokerCard> getDeck() {
        return deck;
    }

    //Method to draw a random card from the deck
    public PokerCard drawRandomCard() {
        if (deck.size() > 0) {

            Random rand = new Random();
            int positionCard = rand.nextInt(deck.size());
            PokerCard cardDrawn = deck.get(positionCard);
            deck.remove(positionCard);
            return cardDrawn;

        }
        return null;
    }
}
