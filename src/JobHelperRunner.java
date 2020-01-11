import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;

public class JobHelperRunner {

	public static void main(String[]args) throws InterruptedException {
		JobHelperGui gui = new JobHelperGui();
		
		// a sample bar chart display
		EventQueue.invokeLater(() -> {
            BarChart bar = new BarChart();
            bar.setVisible(true);
        });
		
		TimeUnit.SECONDS.sleep(1);
		
		// a sample pie chart display
		EventQueue.invokeLater(() -> {
            PieChart pie = new PieChart();
            pie.setVisible(true);
        });
		
	}
}
