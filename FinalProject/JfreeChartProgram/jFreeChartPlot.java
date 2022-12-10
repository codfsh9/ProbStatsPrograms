import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class jFreeChartPlot extends JFrame {
    //Determine size of arrays
    int userVal = 100;

    //Create JFreeChart
    public jFreeChartPlot(int userVals) {
        super("XY Line Chart");
        this.userVal = userVals;
        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);

        setSize(800, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    //Creates a line chart object and returns it to chart
    private JPanel createChartPanel() {
        String chartTitle = "Plot, Salt, & Smooth Graph";
        String xAxisLabel = "X Values";
        String yAxisLabel = "Y Values";

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset);

        final XYPlot plot1 = chart.getXYPlot();

        //Adds markers for each value on the graph
        XYLineAndShapeRenderer renderer =
                (XYLineAndShapeRenderer) plot1.getRenderer();
        renderer.setBaseShapesVisible(true);

        //Optional set the background color
        chart.getXYPlot().setBackgroundPaint(Color.DARK_GRAY);

        //Optional set smoothed line to yellow instead of green
        plot1.getRenderer().setSeriesPaint(2, new Color(219,215,90));

        return new ChartPanel(chart);

    }

    //Creates an XY dataset and returns it
    private XYDataset createDataset() {

        JDKRandomGenerator rand = new JDKRandomGenerator();
        final XYSeries ogGraph = new XYSeries("Original");

        //Arrays for X and Y values
        Double[] x1 = new Double[userVal];
        Double[] y1 = new Double[userVal];

        //Add x values from 1 to length of the array to dataset
        double genx = 0;
        for (int i = 0; i < userVal; i++) {
            x1[i] = genx;
            genx += 1;
        }

        //Add the slope function y = 2x + 5 to dataset
        double geny = 0;
        for (int i = 0; i < userVal; i++) {
            geny = (2 * ((x1[i])) + 5);
            y1[i] = geny;
            ogGraph.add(x1[i], y1[i]);
        }

        //Method to salt the data
        final XYSeries saltedData = new XYSeries("Salted");

        double newVal = 0;

        //For loop with random integer (0-2) to randomize y values
        for (int i = 0; i < userVal; i++) {
            int randoDecider = rand.nextInt(2);
            if (randoDecider == 0) {
                newVal = y1[i] + (rand.nextInt(25));
                y1[i] = newVal;
                randoDecider = 1;
            }
            if (randoDecider == 1) {
                newVal = y1[i] - (rand.nextInt(25) + 5);
                y1[i] = newVal;
                randoDecider = 2;
            }
            if (randoDecider == 2) {
                newVal = y1[i] + (rand.nextInt(30) - 10);
                y1[i] = newVal;
                randoDecider = 0;
            }
            //Add the x and y values to salted data
            saltedData.add(x1[i], y1[i]);
        }

        //Method to smooth the data
        final XYSeries smoothedData = new XYSeries("Smoothed");

        //Use Apache's mean function to smooth the data.
        //Finds the mean of X y values. Here I am using rolling average
        //with 5 values and dividing it for better result.
        Mean m1 = new Mean();
        Double[] mean = new Double[userVal - 5];

        for (int i = 0; i < userVal - 5; i++) {
            m1.increment(y1[i]);
            m1.increment(y1[i + 1]);
            m1.increment(y1[i + 2]);
            m1.increment(y1[i + 3]);
            m1.increment(y1[i + 4]);
            m1.increment(y1[i + 5]);

            mean[i] = m1.getResult();
            m1.clear();

            smoothedData.add(x1[i], mean[i]);
        }

        //Add the original, salted, and smoothed data to the graph.
        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(ogGraph);
        dataset.addSeries(saltedData);
        dataset.addSeries(smoothedData);

        return dataset;
    }
}
