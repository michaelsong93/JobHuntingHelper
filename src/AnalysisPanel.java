import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class AnalysisPanel extends JPanel {
	
	AnalysisPanel() {
		setBounds(565, 76, 186, 408);
		setBorder(new TitledBorder(null, "Analysis", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		
		JButton analyzeButton = new JButton("Analyze");
		analyzeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		analyzeButton.setBounds(26, 117, 132, 63);
		add(analyzeButton);
		
		JButton exportButton = new JButton("Export");
		exportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		exportButton.setBounds(26, 197, 132, 63);
		add(exportButton);
	}

}
