import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;

/**
 * Hold all positions of interest, for analysis purpose.
 * @author xueyingli
 *
 */
public class Analyzer extends JFrame {
	
	private ArrayList<Position> positions;
	
	public Analyzer() {
		initUI();
	}
	
	private void initUI() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Bar chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	/**
	 * Create a month to number dataset for bar chart.
	 * @return Y-axis is the # of positions applied each month.
	 */
    private CategoryDataset createDataset() {

    	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    	
//    	HashMap<Integer, Integer> monthToCount = new HashMap<>();
//    	for (Position p : positions) {
//    		int month = p.getDateSubmitted().MONTH;
//    		int count = monthToCount.getOrDefault(month, 0);
//    		monthToCount.put(month, count + 1);
//    	}
    	
//      for (int month : monthToCount.keySet()) {
//    	dataset.setValue(monthToCount.get(month), "# of companies", month + 1 + "");
//    }
    	
        dataset.setValue(6, "# of companies", "June");
        dataset.setValue(7, "# of companies", "July");
        dataset.setValue(8, "# of companies", "August");
        dataset.setValue(9, "# of companies", "September");
        
        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "# of companies applied each month",
                "Month",
                "# of companies",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        return barChart;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            Analyzer ex = new Analyzer();
            ex.setVisible(true);
        });
    }
}

