import org.jfree.chart.plot.XYPlot;

import javax.swing.*;

public class jFreeChartPlotTest {

    public static void main(String[] args)
    {
        //Run the program
        SwingUtilities.invokeLater(() -> new jFreeChartPlot(100).setVisible(true));
    }

}