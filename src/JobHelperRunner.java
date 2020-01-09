import java.awt.EventQueue;

public class JobHelperRunner {

	public static void main(String[]args) {
		GUI gui = new GUI();
		gui.play();
		
		// a sample bar chart display
		EventQueue.invokeLater(() -> {
            Analyzer ex = new Analyzer();
            ex.setVisible(true);
        });
		
	}
}
