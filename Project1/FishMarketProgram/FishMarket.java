import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class FishMarket {

    ArrayList<Seafood> seafoods = new ArrayList<>();
    Random rand = new Random();

    public void randomSeafood() {

        for (int i = 1; i < 301; i++) {
            //Create variable that is random each loop.
            int randomVariable = rand.nextInt(4);
            //***"Weights"***Second random variable with increased chance of hitting for FISH.
            int weightVariable = rand.nextInt(2);

            //Set a bound for realistic seafood type weights, (rangeMin + (rangeMax - rangeMin) * r.nextDouble();)
            double randCrabWeight = 0.3 + (8.0 - 0.3) * rand.nextDouble();
            double randFishWeight = 1.0 + (15.0 - 1.0) * rand.nextDouble();
            double randShrimpWeight = 0.2 + (4.0 - 0.2) * rand.nextDouble();
            double randScallopWeight = 0.1 + (3.0 - 0.1) * rand.nextDouble();

            //if/else statements to randomly determine type of seafood.
            if (randomVariable == 1) {
                Crab crab = new Crab(i, "Crab", randCrabWeight, 3.15);
                seafoods.add(crab);

            } else if (randomVariable == 2) {
                Fish fish = new Fish(i, "Fish", randFishWeight, 2.50);
                seafoods.add(fish);

            } else if (randomVariable == 3) {
                Shrimp shrimp = new Shrimp(i, "Shrimp", randShrimpWeight, 1.25);
                seafoods.add(shrimp);

            } else {
                Scallop scallop = new Scallop(i, "Scallop", randScallopWeight, 0.75);
                seafoods.add(scallop);

            }


        }
        //Write to the CSV file.
        try {
            FileWriter file = new FileWriter("FMTestFinal3.csv");
            PrintWriter write = new PrintWriter(file);
            //Headers for Excel
            write.print("Index");
            write.print(",");
            write.print("Type");
            write.print(",");
            write.print("Weight");
            write.print(",");
            write.println("Price");
            //Loop through list and write to file.
            for (Seafood list : seafoods) {
                write.println(list);
            }

            //If IOException then do not create file.
            write.close();
        } catch (IOException exe) {
            System.out.println("Cannot create file");
        }


    }


    public void loadCSV() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("FMTestFinal3.csv"));
        ArrayList<String[]> records = new ArrayList<>();
        String[] record;
        while (scan.hasNext()) {
            record = scan.nextLine().split(",");
            records.add(record);
        }
        //loop through the records
        for (String[] temp : records) {
            for (String temp1 : temp) {
                System.out.print(temp1 + "\t");
            }
            System.out.print("\n");
        }
    }


}

