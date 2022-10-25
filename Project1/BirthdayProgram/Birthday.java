import java.util.ArrayList;
import java.util.Random;

public class Birthday {
    public final ArrayList<Person> list;
    public final int numofTrials;
    public final int numofPeople;
    public double birthdayMatches = 0.0;

    //Constructor
    public Birthday(int numofTrials, int numofPeople) {
        this.numofPeople = numofPeople;
        this.numofTrials = numofTrials;
        list = new ArrayList<>();
    }


    //Generate a random Birthday using random with bound 365
    public void genRandomBirthdays() {
        Random rand = new Random();
        for (int i = 0; i < numofPeople; i++) {
            list.add(new Person(rand.nextInt(365) + 1));
        }
    }

    //Method to run the simulation/trials
    public void startTrial() {
        for (int i = 0; i < numofTrials; i++) {
            genRandomBirthdays();
            for (int j = 0; j < list.size(); j++) {
                for (int x = j + 1; x < list.size(); x++) {
                    if (list.get(j).getBirthday() == list.get(x).getBirthday()) {
                        list.clear();
                        birthdayMatches += 1;
                    }
                }
            }
            list.clear();
        }
    }

    //Print out the user's input followed by calculation
    public void Result() {
        System.out.println("In " + numofTrials + " Trials with " + numofPeople + " different People, Percentage " +
                "of Birthdays Matched: " + (birthdayMatches / numofTrials) * 100 + "%");
    }
}