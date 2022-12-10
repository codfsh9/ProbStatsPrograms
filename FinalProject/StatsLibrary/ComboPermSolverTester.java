public class ComboPermSolverTester {
    public static void main(String[] args)
    {
        //Create new Object
        ComboPermSolver test = new ComboPermSolver();

        //Permutation book problem, answer should be 990.
        System.out.print("Exercise 2.42), A personnel director for a corporation has hired ten new engineers. If three (distinctly different)\n" +
                "positions are open at a Cleveland plant, in how many ways can she fill the positions?\n\n");
        System.out.println("Permutation: " + test.Permutation(11, 3) + " ways.\n");


        //Combination book problem, answer should be 19600.
        System.out.println("Exercise 2.51) A local fraternity is conducting a raffle where 50 tickets are to be sold—one per customer.\n" +
                "There are three prizes to be awarded. If the four organizers of the raffle each buy one ticket,\n" +
                "What is the probability that the four organizers win\n" +
                "all of the prizes?\n");
        System.out.println("Combination: " + test.Combination(50, 3) + " ways.");
    }
}
