public class GameShowTester {
    public static void main(String[] args) {
        GameShow test = new GameShow();

        System.out.println("The following program tests the Monte Hall problem where\n a contestant has to choose 1 curtain out of 3 to win a prize.\n");
        System.out.println("Contestant that won prize without switching curtains: " + test.StayWins() + " out of 10,000 trials (" + test.StayWinsP() + "%)");
        System.out.println("Contestant that won prize that did switch curtains: " + test.SwitchWins() + " out of 10,000 trials (" + test.SwitchWinsP() + "%)");
    }
}
