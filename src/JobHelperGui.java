import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class JobHelperGui {

	private JFrame frame;
	private BridgeInterface upperSender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JobHelperGui window = new JobHelperGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JobHelperGui() {
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

		// companly list panel
		JPanel companyListPanel = new JPanel();
		companyListPanel.setBorder(new TitledBorder(null, "Company List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		companyListPanel.setBounds(32, 76, 206, 408);
		frame.getContentPane().add(companyListPanel);
		companyListPanel.setLayout(null);

		//// list
		JList list = new JList();
		list.setBounds(19, 22, 166, 203);
		companyListPanel.add(list);

		//// buttons
		JButton addButton = new JButton("Add");
		addButton.setBounds(29, 237, 156, 29);
		companyListPanel.add(addButton);
		
		JButton editButton = new JButton("Edit");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editButton.setBounds(29, 271, 156, 29);
		companyListPanel.add(editButton);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteButton.setBounds(29, 305, 156, 29);
		companyListPanel.add(deleteButton);
		
//		JButton statusCheckButton = new JButton("Status Check");
//		statusCheckButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		statusCheckButton.setBounds(29, 339, 156, 29);
//		companyListPanel.add(statusCheckButton);
//		
//		JButton whatsMissingButton = new JButton("What's Missing?");
//		whatsMissingButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		whatsMissingButton.setBounds(29, 373, 156, 29);
//		companyListPanel.add(whatsMissingButton);
//		addButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		
		JPanel companyInfoPanel = new JPanel();
		companyInfoPanel.setBorder(new TitledBorder(null, "Company Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		companyInfoPanel.setBounds(250, 76, 303, 408);
		frame.getContentPane().add(companyInfoPanel);
		companyInfoPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 25, 291, 377);
		companyInfoPanel.add(panel);
		panel.setLayout(null);
		
		JLabel companyName = new JLabel("Company Name");
		companyName.setBounds(6, 0, 129, 16);
		panel.add(companyName);
		
		JLabel size = new JLabel("Company Size");
		size.setBounds(6, 20, 129, 16);
		panel.add(size);
		
		JLabel linkToApplication = new JLabel("Application Link");
		linkToApplication.setBounds(6, 40, 129, 16);
		panel.add(linkToApplication);
		
		JLabel role = new JLabel("Role");
		role.setBounds(6, 60, 129, 16);
		panel.add(role);
		
		JLabel dateDeadline = new JLabel("Date Deadline");
		dateDeadline.setBounds(6, 80, 129, 16);
		panel.add(dateDeadline);
		
		JLabel recruiterName = new JLabel("Recruiter Name");
		recruiterName.setBounds(6, 100, 129, 16);
		panel.add(recruiterName);
		
		JLabel recruiterToLinkedIn = new JLabel("Recruiter LinkedIn");
		recruiterToLinkedIn.setBounds(6, 120, 129, 16);
		panel.add(recruiterToLinkedIn);
		
		JLabel dateSubmitted = new JLabel("Submitted Date");
		dateSubmitted.setBounds(6, 140, 129, 16);
		panel.add(dateSubmitted);
		
		JLabel dateToFollowUp = new JLabel("Date to Follow Up");
		dateToFollowUp.setBounds(6, 160, 129, 16);
		panel.add(dateToFollowUp);
		
		JLabel comments = new JLabel("Comments");
		comments.setBounds(6, 180, 129, 16);
		panel.add(comments);
		
		JLabel requirements = new JLabel("Requirements");
		requirements.setBounds(6, 220, 129, 16);
		panel.add(requirements);
		
		JLabel resume = new JLabel("Resume");
		resume.setBounds(16, 240, 119, 16);
		panel.add(resume);
		
		JLabel application = new JLabel("Application");
		application.setBounds(16, 260, 119, 16);
		panel.add(application);
		
		JLabel status = new JLabel("Status");
		status.setBounds(6, 300, 129, 16);
		panel.add(status);
		
		
		JPanel companyAnalysisPanel = new JPanel();
		companyAnalysisPanel.setBounds(565, 76, 186, 408);
		frame.getContentPane().add(companyAnalysisPanel);
		companyAnalysisPanel.setBorder(new TitledBorder(null, "Analysis", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		companyAnalysisPanel.setLayout(null);
		
		JButton analyzeButton = new JButton("Analyze");
		analyzeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		analyzeButton.setBounds(26, 117, 132, 63);
		companyAnalysisPanel.add(analyzeButton);
		
		JButton exportButton = new JButton("Export");
		exportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		exportButton.setBounds(26, 197, 132, 63);
		companyAnalysisPanel.add(exportButton);
		

	}
}
