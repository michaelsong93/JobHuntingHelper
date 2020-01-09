import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

public class PieChart extends JFrame {
	
	private ArrayList<Position> positions;

    public PieChart() {

        initUI();
    }

    private void initUI() {

        DefaultPieDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Pie chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private DefaultPieDataset createDataset() {

    	DefaultPieDataset dataset = new DefaultPieDataset();
    	
//    	int[] counts = new int[3];
//    	for (Position p : positions) {
//    		String status = p.getStatus();
//    		switch (status) {
//			case "No response": counts[0]++;
//					break;
//			case "Positive response": counts[1]++;
//					break;
//			case "Directly rejected": counts[2]++;
//					break;
//    		}
//		}
//    		
//    	dataset.setValue("No response", counts[0]);
//    	dataset.setValue("Positive response", counts[1]);
//    	dataset.setValue("Directly rejected", counts[2]);
    	
        dataset.setValue("No response", 56);
        dataset.setValue("Positive response", 32);
        dataset.setValue("Directly rejected", 30);

        return dataset;
    }

    private JFreeChart createChart(DefaultPieDataset dataset) {

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Response breakdown",
                dataset,
                false, true, false);

        return pieChart;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            PieChart pie = new PieChart();
            pie.setVisible(true);
        });
    }
}