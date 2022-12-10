public class SDSolver {
    double sum = 0.0;
    double mean;
    double SD = 0.0;
    double squareRoot;
    double result;

    //Standard Deviation method
    public double getSD(int[] someNumbers) {


        for (int someNumber : someNumbers) {
            sum = sum + someNumber;

        }
        //Solve for mean to use later.
        mean = sum / someNumbers.length;

        //SD formula using the mean variable.
        for (int someNumber : someNumbers) {
            SD = SD + Math.pow((someNumber - mean), 2);
        }
        squareRoot = SD / someNumbers.length;
        result = Math.sqrt(squareRoot);
        return result;
    }

}
