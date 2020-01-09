import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;

	ArrayList<Position> position = new ArrayList<Position>();
	//Actions actions = new Actions();
	
	JPanel companyInfo;
	JTextArea companyName;
	JTextField companyNameField;
	JTextArea size;
	JTextArea linkToApplication;
	JTextArea role;
	JTextArea dateDeadline;
	JTextArea recruiterName;
	JTextArea recruiterToLinkedIn;
	JTextArea dateSubmitted;
	JTextArea dateToFollowUp;
	JTextArea comments;
	ButtonGroup companyStatus;
	JButton companyAdd;
	
	JPanel companyList;
	JButton companyEdit;
	JButton companyDelete;
	JButton companyStatusCheck;
	JButton companyMissing;
	
	JPanel result;
	JButton companyAnalyze;
	JButton companyExport;
	
	public void play() {
		
		setSize(800,550);
		setTitle("Job-Hunting Helper");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JOptionPane.showMessageDialog(null, "Welcome to Job-Hunting Helper!");
		
		companyInfo = new JPanel();
		companyName = new JTextArea("Company Name: ");
		companyName.setSize(111, 16);
		companyName.setEditable(false);
		companyInfo.add(companyName);

		companyNameField = new JTextField();
		companyNameField.setSize(130, 16);
		companyInfo.add(companyNameField);
		
		companyInfo.setBounds(318, 6, 300, 230);
		companyInfo.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(companyInfo);
		
		
		
		companyList = new JPanel();
		
		result = new JPanel();
		
		
	}
}
