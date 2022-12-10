import java.util.Arrays;

public class StatsTester {

    public static void main (String[] args) {

        //Array of numbers from 1 to 100 unordered.
        int[] someNumbers = {1, 2, 3, 4, 5, 5, 30, 45, 100, 12, 15, 99};

        //Create new object
        StatsMMM test = new StatsMMM();

        System.out.println("This program will determine the mean, median, mode & standard deviation" +
                " of the following data set:");
        //Print out the array.
        System.out.println(Arrays.toString(someNumbers) + "\n");
        //Print Mean.
        System.out.println("Mean: " + test.Mean(someNumbers));
        //Print Median.
        System.out.println("Median: " + test.Median(someNumbers));
        //Print Mode.
        System.out.println("Mode: " + test.Mode(someNumbers));



    }
}
