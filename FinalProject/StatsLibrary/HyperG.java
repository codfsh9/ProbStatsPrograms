public class HyperG {

    double populationSize, sampleSize, numOfSuccess, numChosen;

    //Constructor
    public HyperG(double populationSize, double sampleSize, double numOfSuccess, double numChosen) {
        this.populationSize = populationSize;
        this.sampleSize = sampleSize;
        this.numOfSuccess = numOfSuccess;
        this.numChosen = numChosen;

    }

    //Method to calculate and return factorial
    public double Factorial(double n) {
        double sum = n;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                sum = sum * i;
            }
        }
        return sum;
    }

    //Method to calculate and return combination
    public double Combination(double n, double r) {
        double result;
        double fact1 = 0, fact2 = 0, fact3 = 0;
        fact1 = Factorial(n);
        fact2 = Factorial(n-r);
        fact3 = Factorial(r);
        result = fact1 / (fact2 * fact3);
        return result;
    }

    //Method to calculate Hypergeometric formula and returns result
    public void calcHyperG() {
        double top = (populationSize - numOfSuccess);
        double bottom = (sampleSize - numChosen);
        double n1 = Combination(top, bottom);
        double n2 = Combination(numOfSuccess, numChosen);
        double n3 = Combination(populationSize, sampleSize);
        double result = ((n1 * n2) / n3);
        System.out.printf("Hypergeometric Distribution Probability: %,.5f%n", result);
    }
}
