//Class
public class Binomial {
    double x, n, probSuccess, probFailure;

    //Constructor
    public Binomial(double x, double n,double probSuccess,double probFailure){
        this.x = x;
        this.n = n;
        this.probSuccess = probSuccess;
        this.probFailure = probFailure;

    }

    //Method that calculates factorial and returns result
    public double Factorial(double n) {
        double result = n;
        for(int i = 0; i < n; i++) {
            if (i != 0) {
                result = result * i;
            }
        }
        return result;
    }

    //Method that calculates combination and returns result
    public double Combination(double n, double r) {
        double result;
        double fact1, fact2, fact3;
        fact1 = Factorial(n);
        fact2 = Factorial(r);
        fact3 = Factorial(n-r);
        result = fact1/(fact2 * fact3);
        return result;

    }

    //Method that calculate the Binomial Distribution formula and returns value
    public void calcBinomial(){
        double comb = Combination(n, x);
        double answer = comb * ((Math.pow(probSuccess, 2)) * Math.pow((1 - probFailure), n - x));
        System.out.printf("Binomial: %,.5f%n", answer);
    }

}