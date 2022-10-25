import java.util.Arrays;

public class VarianceSolverTester {

    public static void main(String[] args)
    {

        //Array of numbers
        int[] someNumbers = {10, 20, 30, 40 ,50, 60, 70, 80, 90, 100};
        //Create instance of class VarianceSolver
        VarianceSolver vs = new VarianceSolver();

        //Print out array followed by the variance result
        System.out.println("This program will determine the variance of the following numbers");
        System.out.println(Arrays.toString(someNumbers) + "\n");
        System.out.printf("Variance: %,.3f%n", vs.getVariance(someNumbers));
    }

}
