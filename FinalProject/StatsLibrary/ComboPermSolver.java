import java.math.BigInteger;

public class ComboPermSolver {

    //Factorial method using BigInteger to work with larger values.
    public BigInteger Factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    //Permutation formula n!/(n-r)!. Store values in BigInteger variable to divide.
    public BigInteger Permutation(int n, int r) {
        BigInteger fact1 = Factorial(n);
        BigInteger fact2 = Factorial(n - r);
        return fact1.divide(fact2);
    }

    //Combination formula n!/r!(n-r)!. Store values in BigInteger variable to divide.
    public BigInteger Combination(int n, int r) {
        BigInteger fact1 = Factorial(n);
        BigInteger fact2 = Factorial(r);
        BigInteger fact3 = Factorial(n - r);
        return fact1.divide(fact2.multiply(fact3));
    }
}
