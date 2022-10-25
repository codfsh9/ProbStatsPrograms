import java.io.FileNotFoundException;

public class FishMarketTester {

    public static void main(String[] args) throws FileNotFoundException {
        //Create obj
        FishMarket test = new FishMarket();
        //Run the program
        test.randomSeafood();
        //Load and print CSV file
        test.loadCSV();

    }

}
