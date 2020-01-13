import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class InfoPanel extends JPanel {
	
	JPanel panel;
	JTextArea companyName;
	JTextArea size;
	JTextArea role;
	JTextArea resumeStatus;
	JTextArea coverLetterStatus;
	JTextArea applicationStatus;
	JTextArea dateDeadline;
	JTextArea dateSubmitted;
	JTextArea comments;
	JTextArea status;
	
	InfoPanel() {
		setBorder(new TitledBorder(null, "Company Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(250, 76, 303, 408);
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(6, 25, 291, 377);
		add(panel);
		panel.setLayout(null);
		
		companyName = new JTextArea("Company Name: ");
		companyName.setBackground(panel.getBackground());
		companyName.setBounds(6, 0, 129, 16);
		panel.add(companyName);
		
		size = new JTextArea("Company Size: ");
		size.setBackground(panel.getBackground());
		size.setBounds(6, 20, 129, 16);
		panel.add(size);
		
		role = new JTextArea("Role: ");
		role.setBackground(panel.getBackground());
		role.setBounds(6, 40, 129, 16);
		panel.add(role);
		
		resumeStatus = new JTextArea("Resume Status: ");
		resumeStatus.setBackground(panel.getBackground());
		resumeStatus.setBounds(6, 60, 129, 16);
		panel.add(resumeStatus);
		
		coverLetterStatus = new JTextArea("Cover Letter Status: ");
		coverLetterStatus.setBackground(panel.getBackground());
		coverLetterStatus.setBounds(6, 80, 129, 16);
		panel.add(coverLetterStatus);
		
		applicationStatus = new JTextArea("Application Status: ");
		applicationStatus.setBackground(panel.getBackground());
		applicationStatus.setBounds(6, 100, 129, 16);
		panel.add(applicationStatus);
		
		dateDeadline = new JTextArea("Deadline: ");
		dateDeadline.setBackground(panel.getBackground());
		dateDeadline.setBounds(6, 120, 129, 16);
		panel.add(dateDeadline);
		
		dateSubmitted = new JTextArea("Submitted Date: ");
		dateSubmitted.setBackground(panel.getBackground());
		dateSubmitted.setBounds(6, 140, 129, 16);
		panel.add(dateSubmitted);
		
		comments = new JTextArea("Comments: ");
		comments.setBackground(panel.getBackground());
		comments.setBounds(6, 160, 129, 16);
		panel.add(comments);
		
		status = new JTextArea("Status: ");
		status.setBackground(panel.getBackground());
		status.setBounds(6, 200, 129, 16);
		panel.add(status);
	}
	
	public void setTextArea(Position p) {
		companyName.setText("Company Name: " + p.getCompanyName());
		size.setText("Company Size: " + p.getSize());
		role.setText("Role: " + p.getRole());
		resumeStatus.setText("Resume Status: " + p.getResumeStatus());
		coverLetterStatus.setText("Cover Letter Status: " + p.getCoverLetterStatus());
		applicationStatus.setText("Application Status: " + p.getApplicationStatus());
		dateDeadline.setText("Deadline: " + p.getDateDeadline());
		dateSubmitted.setText("Submitted Date: " + p.getDateSubmitted());
		comments.setText("Comments: " + p.getComments());
		status.setText("Status: " + p.getStatus());
	}

}
