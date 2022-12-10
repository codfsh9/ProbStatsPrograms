public class VarianceSolver {
    double sum = 0.0;
    double mean;
    double SD = 0.0;
    double squareRoot;
    double result;


    //Variance method
    public double getVariance(int[] someNumbers) {


        for (int someNumber : someNumbers) {
            sum = sum + someNumber;
        }
        //Solve for the mean
        mean = sum / someNumbers.length;

        //Use SD formula and square the result
        for (int someNumber : someNumbers) {
            SD = SD + Math.pow((someNumber - mean), 2);
        }
        squareRoot = SD / someNumbers.length;
        result = Math.sqrt(squareRoot);
        return Math.pow(result, 2);
    }

}
