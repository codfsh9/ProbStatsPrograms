public class GeometricTester {

    //Main Method
    public static void main(String[] args) {
        //Create obj of Geometric and calls method to solve
        Geometric g = new Geometric(.3, 5);
        //Book problem 3.67, p = .30, n = 5
        System.out.println("Exercise 3.67) Suppose that 30% of the applicants for a certain industrial job possess advanced training in com-\n" +
                "puter programming. Applicants are interviewed sequentially and are selected at random from\n" +
                "the pool. Find the probability that the first applicant with advanced training in programming\n" +
                "is found on the fifth interview.\n");
        //Call method to calculate answer
        g.calcGeometric();
    }

}
