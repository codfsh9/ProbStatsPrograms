public class PokerCard extends Card {
    private final int suite;
    private final int number;

    public PokerCard(int userSuite, int userNumber) {
        suite = userSuite;
        number = userNumber;
    }

    public int getSuite() {
        return suite;
    }

    public int getNumber() {
        return number;
    }

    @Override
    /**
     * Overriding toString
     */
    public String toString() {
        return "(" + suite + ", " + number + ")";
    }
}
