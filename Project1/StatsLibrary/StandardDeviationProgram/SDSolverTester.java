import java.util.Arrays;

public class SDSolverTester {

    public static void main(String[] args) {

        //Array of numbers
        int[] someNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //Create instance of SDSolver
        SDSolver test = new SDSolver();

        //Print out the array and Standard Deviation.
        System.out.println("This program will determine the standard deviation of the following sample.");
        System.out.println(Arrays.toString(someNumbers) + "\n");
        System.out.printf("Standard Deviation: %,.3f%n", test.getSD(someNumbers));
    }

}
