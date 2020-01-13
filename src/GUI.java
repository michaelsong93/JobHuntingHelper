import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class GUI {

	private JFrame frame;
	
	private BridgeInterface upperSender;
	
	private CompanyListPanel companyListPanel;
	private InfoPanel infoPanel;
	private AnalysisPanel analysisPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	public GUI() {
		start();
	}

	private void start() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// welcome message
		JOptionPane.showMessageDialog(null, "Welcome to Job-Hunting Helper!");
		
		JLabel label = new JLabel("Job-Hunting Helper");
		label.setBounds(32, 32, 132, 16);
		frame.getContentPane().add(label);
		
		// 1st panel
		CompanyListPanel companyListPanel = new CompanyListPanel();
		frame.getContentPane().add(companyListPanel);
		
		// 2nd panel
		InfoPanel companyInfoPanel = new InfoPanel();
		frame.getContentPane().add(companyInfoPanel);
		
		// 3rd panel
		AnalysisPanel companyAnalysisPanel = new AnalysisPanel();
		frame.getContentPane().add(companyAnalysisPanel);
		
		companyListPanel.setBridge(new BridgeInterface() {
			@Override
			public void positionBridge(Position p) {
				infoPanel.setTextArea(p);
			}
		});
	}

}
