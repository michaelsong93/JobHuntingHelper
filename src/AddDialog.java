import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddDialog extends JDialog implements ActionListener{

	private JLabel name, size, role, coverLetter, resume, application, dateDeadline, dateSubmitted, status, comments;
	private JTextField nameField, sizeField, roleField, dateDeadlineField, dateSubmittedField, commentsField;
	private JButton addButton, exitButton;
	private JRadioButton coverLetterSubmitted, coverLetterNotYet, coverLetterNotRequired, resumeSubmitted, resumeNotYet, resumeNotRequired, appSubmitted, appNotYet, appNotRequired;
	private Position position;
	private String[] statuses = {"Submitted", "Not submitted", "On progress", "Rejected", "No response", "Take home", "On-site", "Phone screen", "Offer", "No longer interested"};
	private JComboBox statusCB;
	private BridgeInterface sender;
	public Actions action = new Actions();
	
	public AddDialog() {

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		setSize(600, 500);
		setVisible(true);

		name = new JLabel("Company name: ");
		size = new JLabel("Size: ");
//		appLink = new JLabel("Position website: ");
		role = new JLabel("Role: ");
		coverLetter = new JLabel("Cover letter: ");
		resume = new JLabel("Resume: ");
		application = new JLabel("Application: ");
		dateDeadline = new JLabel("Deadline (mm/dd/yyyy): ");
//		recruiterName = new JLabel("Name of recruiter: ");
//		recruiterLinkedIn = new JLabel("Recruiter's LinkedIn: ");
		dateSubmitted = new JLabel("Date of submission (mm/dd/yyyy): ");
		status = new JLabel("Status: ");
		comments = new JLabel("Comments: ");

		nameField = new JTextField(10);
		sizeField = new JTextField(10);
//		appLinkField = new JTextField(10);
		roleField = new JTextField(10);
		dateDeadlineField = new JTextField(10);
//		recruiterNameField = new JTextField(10);
//		recruiterLinkedInField = new JTextField(10);
		dateSubmittedField = new JTextField(10);
		commentsField = new JTextField(10);

		coverLetterSubmitted = new JRadioButton("Submitted");
		coverLetterNotYet = new JRadioButton("Not submitted");
		coverLetterNotRequired = new JRadioButton("Not required");
		ButtonGroup coverLetterGroup = new ButtonGroup();
		coverLetterGroup.add(coverLetterSubmitted);
		coverLetterGroup.add(coverLetterNotRequired);
		coverLetterGroup.add(coverLetterNotYet);

		resumeSubmitted = new JRadioButton("Submitted");
		resumeNotYet = new JRadioButton("Not submitted");
		resumeNotRequired = new JRadioButton("Not required");
		ButtonGroup resumeGroup = new ButtonGroup();
		resumeGroup.add(resumeSubmitted);
		resumeGroup.add(resumeNotRequired);
		resumeGroup.add(resumeNotYet);

		appSubmitted = new JRadioButton("Submitted");
		appNotYet = new JRadioButton("Not submitted");
		appNotRequired = new JRadioButton("Not required");
		ButtonGroup appGroup = new ButtonGroup();
		appGroup.add(appSubmitted);
		appGroup.add(appNotRequired);
		appGroup.add(appNotYet);
		
		statusCB = new JComboBox(statuses);
		statusCB.setBounds(50, 50, 90, 20);

		addButton = new JButton("Add");
		exitButton = new JButton("Exit");



		// name
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(name, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(nameField, gbc);

		// size
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(size, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(sizeField, gbc);

		// appLink
//		gbc.weightx = 1;
//		gbc.weighty = 0.1;
//		gbc.gridx = 0;
//		gbc.gridy = 2;
//		gbc.insets = new Insets(0, 0, 0, 5);
//		gbc.anchor = GridBagConstraints.LINE_END;
//		add(appLink, gbc);
//		gbc.gridx = 1;
//		gbc.gridy = 2;
//		gbc.insets = new Insets(0, 0, 0, 0);
//		gbc.anchor = GridBagConstraints.LINE_START;
//		add(appLinkField, gbc);

		// role
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(role, gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(roleField, gbc);

		// cover letter
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(coverLetter, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(coverLetterSubmitted, gbc);
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(coverLetterNotYet, gbc);
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(coverLetterNotRequired, gbc);

		// resume
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(resume, gbc);
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(resumeSubmitted, gbc);
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(resumeNotYet, gbc);
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(resumeNotRequired, gbc);

		// application
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(application, gbc);
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(appSubmitted, gbc);
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(appNotYet, gbc);
		gbc.gridx = 3;
		gbc.gridy = 6;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(appNotRequired, gbc);

		// deadline date
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(dateDeadline, gbc);
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(dateDeadlineField, gbc);

		// recruiter name
//		gbc.weightx = 1;
//		gbc.weighty = 0.1;
//		gbc.gridx = 0;
//		gbc.gridy = 8;
//		gbc.insets = new Insets(0, 0, 0, 5);
//		gbc.anchor = GridBagConstraints.LINE_END;
//		add(recruiterName, gbc);
//		gbc.gridx = 1;
//		gbc.gridy = 8;
//		gbc.insets = new Insets(0, 0, 0, 0);
//		gbc.anchor = GridBagConstraints.LINE_START;
//		add(recruiterNameField, gbc);

		// recruiter LinkedIn
//		gbc.weightx = 1;
//		gbc.weighty = 0.1;
//		gbc.gridx = 0;
//		gbc.gridy = 9;
//		gbc.insets = new Insets(0, 0, 0, 5);
//		gbc.anchor = GridBagConstraints.LINE_END;
//		add(recruiterLinkedIn, gbc);
//		gbc.gridx = 1;
//		gbc.gridy = 9;
//		gbc.insets = new Insets(0, 0, 0, 0);
//		gbc.anchor = GridBagConstraints.LINE_START;
//		add(recruiterLinkedInField, gbc);

		// submission date
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(dateSubmitted, gbc);
		gbc.gridx = 1;
		gbc.gridy = 10;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(dateSubmittedField, gbc);

		// status
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 11;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(status, gbc);
		gbc.gridx = 1;
		gbc.gridy = 11;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(statusCB, gbc);
		
		// comments
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 12;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.anchor = GridBagConstraints.LINE_END;
		add(comments, gbc);
		gbc.gridx = 1;
		gbc.gridy = 12;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.LINE_START;
		add(commentsField, gbc);

		// add button
		gbc.weightx = 1;
		gbc.weighty = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 13;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(addButton, gbc);

		// exit button
		gbc.weightx = 1;
		gbc.weighty = 1.0;
		gbc.gridx = 1;
		gbc.gridy = 13;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(exitButton, gbc);
		
		addButton.addActionListener(this);
		exitButton.addActionListener(this);

	}
	
	public void setBridge(BridgeInterface bridge) {
		sender = bridge;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new AddDialog();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		
		if(button == addButton) {
			String companyName = nameField.getText();
			String companySize = sizeField.getText();
//			String applicationLink = appLinkField.getText();
			String positionRole = roleField.getText();
			String coverStatus = "";
			String resumeStatus = "";
			String appStatus = "";
			String deadlineDate = dateDeadlineField.getText();
//			String recrName = recruiterNameField.getText();
//			String recrLinkedIn = recruiterLinkedInField.getText();
			String submitDate = dateSubmittedField.getText();
			String positionStatus = statusCB.getSelectedItem().toString();
			String comm = commentsField.getText();
			
			if (coverLetterSubmitted.isSelected()) {
				coverStatus = coverLetterSubmitted.getText();
			}
			else if (coverLetterNotYet.isSelected()) {
				coverStatus = coverLetterNotYet.getText();
			}
			else if (coverLetterNotRequired.isSelected()) {
				coverStatus = coverLetterNotRequired.getText();
			}
			
			if (resumeSubmitted.isSelected()) {
				resumeStatus = resumeSubmitted.getText();
			}
			else if (resumeNotYet.isSelected()) {
				resumeStatus = resumeNotYet.getText();
			}
			else if (resumeNotRequired.isSelected()) {
				resumeStatus = resumeNotRequired.getText();
			}
			
			if (appSubmitted.isSelected()) {
				appStatus = appSubmitted.getText();
			}
			else if (appNotYet.isSelected()) {
				appStatus = appNotYet.getText();
			}
			else if (appNotRequired.isSelected()) {
				appStatus = appNotRequired.getText();
			}
			
			Position p = new Position(companyName, companySize, positionRole, resumeStatus, coverStatus, appStatus, deadlineDate, submitDate, positionStatus, comm);
			sender.positionBridge(p);
			dispose();
		}
		else if(button == exitButton) {
			dispose();
		}
		
	}
}
