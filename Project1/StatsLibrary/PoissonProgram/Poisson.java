public class Poisson {

    int lambda, x;

    //Constructor
    public Poisson(int lambda, int x)
    {
        this.lambda = lambda;
        this.x = x;
    }

    //Method to calculate factorial and return result
    public double Factorial(double n) {
        double result = n;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                result = result * i;
            }
        }
        return result;
    }

    //Method to calculate Poisson formula and return result
    public void calcPoisson()
    {
        double result = Math.pow(lambda, x) * Math.pow(Math.E, -lambda) / Factorial(x);
        System.out.printf("Poisson Distribution: %,.5f%n", result);
    }
}
