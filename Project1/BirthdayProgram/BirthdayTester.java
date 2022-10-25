import java.util.Scanner;

public class BirthdayTester {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("-This program determines the probability of X amount of people sharing the same Birthday" +
                " in the same room.-\n");

        //Ask user to enter amount of people
        System.out.print("Enter # of People: ");
        int numOfPeople = scan.nextInt();

        //Ask user to enter number of runs
        System.out.print("Enter # of Runs: ");
        int numOfRuns = scan.nextInt();

        //Create new instance of class Birthday and fill parameters from user input
        Birthday b = new Birthday(numOfRuns, numOfPeople);
        //Call trial method to start simulation
        b.startTrial();
        //Call method printing the result
        b.Result();


    }
}