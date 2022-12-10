public class HyperGTester {

    public static void main(String[] args)
    {
        //Create instance of HyperG and call calcHyperG for calculation
        HyperG HG = new HyperG(10,5,4,1);
        //Book problem 3.103
        System.out.println("A warehouse contains ten printing machines, four of which are defective. A company selects\n" +
                "five of the machines at random, thinking all are in working condition. What is the probability\n" +
                "that all five of the machines are nondefective?\n");
        HG.calcHyperG();
    }

}
