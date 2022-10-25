import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Plotter {
    public String line = "";
    String filenameSalt = "SaltedGraph.csv";
    String filenameSmooth = "SmoothedGraph.csv";
    ArrayList<Integer> xVal, yVal, saltValsInt, smoothVals;
    ArrayList<String> saltValsS;
    String filenameOG = "Graph.csv";

    //Constructor
    public Plotter() {
        xVal = new ArrayList<>();
        yVal = new ArrayList<>();
        saltValsInt = new ArrayList<>();
        saltValsS = new ArrayList<>();
        smoothVals = new ArrayList<>();
    }


    //Generates x values
    public void xValues() {

        int x = 0;

        //Number of values to be plotted
        for (int i = 0; i < 15; i++) {
            xVal.add(x);
            x++;
        }
        System.out.println("X values: " + xVal);
    }

    //Generates y values (y = mx + b)
    public void yValues() {
        int genYVal;
        for (Integer integer : xVal) {
            genYVal = (2 * integer) + 3;
            yVal.add(genYVal);
        }
        System.out.println("Y values: " + yVal);
    }

    // Writes original graph to csv file
    public void plotterCSV() {
        try (PrintWriter writer = new PrintWriter(filenameOG)) {
            for (Integer integer : xVal) {
                writer.write(integer + ",");

            }
            writer.write("\n");
            for (int i = 0; i < xVal.size(); i++) {
                writer.write(yVal.get(i) + ",");

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error creating or writing to file");
            e.printStackTrace();
        }

    }

    //Grab data from original file and salts the values
    public void saltGraph() {
        Random rand = new Random();
        try {
            int count = 0;

            FileReader fr = new FileReader(filenameOG);
            BufferedReader br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                String[] saltvalsS = line.split(",");
                if (count == 1) {
                    for (int i = 0; i < saltvalsS.length; i++) {
                        saltValsInt.add(Integer.parseInt(saltvalsS[i]));
                        int newval = saltValsInt.get(i);
                        saltValsInt.remove(i);
                        newval = newval + rand.nextInt(9) + 1;
                        saltValsInt.add(newval);
                    }
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Salts the data and writes to CSV file called SaltedGraph
    public void writeSaltedGraph() {
        try (PrintWriter saltWriter = new PrintWriter(filenameSalt)) {
            for (Integer integer : xVal) {
                saltWriter.write(integer + ",");

            }
            saltWriter.write("\n");
            for (Integer integer : saltValsInt) {
                saltWriter.write(integer + ",");

            }

        } catch (FileNotFoundException e) {
            System.out.println("(Salter) Error creating or writing to file");
            e.printStackTrace();
        }
    }

    //Smooths data and writes to CSV file called SmoothGraph
    public void writeSmoothedGraph() {

        for (int i = 0; i < saltValsInt.size() - 2; i++) {
            int smoothval = (saltValsInt.get(i) + saltValsInt.get(i + 1) + saltValsInt.get(i + 2)) / 3;
            smoothVals.add(smoothval);
        }

        try (PrintWriter smoothWriter = new PrintWriter(filenameSmooth)) {
            for (int i = 0; i < saltValsInt.size(); i++) {
                smoothWriter.write(xVal.get(i) + ",");

            }
            smoothWriter.write("\n");
            for (Integer smoothval : smoothVals) {
                smoothWriter.write(smoothval + ",");

            }

        } catch (FileNotFoundException e) {
            System.out.println("(Smoother) Error creating or writing to file");
            e.printStackTrace();
        }
    }


}
