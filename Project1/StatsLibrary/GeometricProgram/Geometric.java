public class Geometric {

    final double p, n;

    //Constructor
    public Geometric(double p, double n) {

        this.n = n;
        this.p = p;

    }
    //Method to calculate the Geometric formula and return result
    public void calcGeometric()
    {
        final double r = Math.pow(1-p, n-1) * p;

        System.out.printf("Geometric Distribution Probability: " + "%.5f", r);
    }
}
