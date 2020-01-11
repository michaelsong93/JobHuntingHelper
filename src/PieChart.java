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
		setTitle("Applied positions breakdown");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private DefaultPieDataset createDataset() {

		DefaultPieDataset dataset = new DefaultPieDataset();
		// status: applied (the total), take home, on-site, phone screen, rejected, offer, no longer interested (ignore)
		// -> applied, in progress, rejected, offer

//		int[] counts = new int[5];
//		for (Position p : positions) {
//			String status = p.getStatus();
//			switch (status) {
//				case "take home": counts[0]++;
//					break;
//				case "on-site": counts[1]++;
//					break;
//				case "phone screen": counts[2]++;
//					break;
//				case "rejected": counts[3]++;
//					break;
//				case "offer": counts[4]++;
//					break;
//			}
//		}
//
//		dataset.setValue("take home", counts[0]);
//		dataset.setValue("on-site", counts[1]);
//		dataset.setValue("phone screen", counts[2]);
//		dataset.setValue("rejected", counts[3]);
//		dataset.setValue("offer", counts[4]);

		dataset.setValue("take home", 3);
		dataset.setValue("on-site", 2);
		dataset.setValue("phone screen", 4);
		dataset.setValue("rejected", 8);
		dataset.setValue("offer", 1);

		return dataset;
	}

	private JFreeChart createChart(DefaultPieDataset dataset) {

		JFreeChart pieChart = ChartFactory.createPieChart(
				"Applied positions breakdown",
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