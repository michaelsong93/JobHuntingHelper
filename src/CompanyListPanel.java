import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class CompanyListPanel extends JPanel implements ActionListener{
	
//	private String prevPropName, prevQuoteName;
//	private JLabel propLabel;
	private JButton addButton, editButton, deleteButton;
	private JList<Position> list;
//	private JScrollPane propScrollList;
	private AddDialog addDialog;
	private EditDialog editDialog;
	private BridgeInterface upper;
	//ArrayList used to save the properties
	private ArrayList<Position> positions = new ArrayList<>();
	private Loader loader = new Loader();
	private SortedExport export = new SortedExport();
//	private DefaultListModel<Property> propModel = new DefaultListModel<Property>(); //declare and initialize at global scope for accessibility
//	private String currentSelectedItem;
	public int addBtnTest;
	
	public CompanyListPanel() {
		
		setBorder(new TitledBorder(null, "Company List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(32, 76, 206, 408);
		setLayout(null);
		
		Loader loader = new Loader();
		positions = loader.load();
		
		//// list
		list = new JList<>();
		list.setBounds(19, 22, 166, 203);
		add(list);

		//// buttons
		addButton = new JButton("Add");
		addButton.setBounds(29, 237, 156, 29);
		add(addButton);

		editButton = new JButton("Edit");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editButton.setBounds(29, 271, 156, 29);
		add(editButton);

		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteButton.setBounds(29, 305, 156, 29);
		add(deleteButton);
		
		// dialogs
		addDialog = new AddDialog();
		addDialog.setVisible(false);
		editDialog = new EditDialog();
		editDialog.setVisible(false);
		
		// listeners
		addButton.addActionListener(this);
		editButton.addActionListener(this);
		deleteButton.addActionListener(this);
		
		addDialog.setBridge(new BridgeInterface() {
			@Override
			public void positionBridge(Position p) {
				positions.add(p);
				export.exportSubmitted(positions, "submitted");
				loader.load();
			}
		});
	}
	
	public void setBridge(BridgeInterface bridge) {
		upper = bridge;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		if (button == addButton) {
			addDialog.setVisible(true);
		} else if (button == editButton) {
			editDialog.setVisible(true);
		} else if (button == deleteButton) {
			
		}
	}

}
