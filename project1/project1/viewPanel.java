//John Armstrong
//Project 2
package project1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class viewPanel extends JPanel {
	private JPanel viewPanel;
	private String ID, NAME;
	private final int WIDTH = 800, HEIGHT = 500;
	AceDataManagerADT m1 = new AceDataManager("./project1/data.txt","./data.txt");
	public viewPanel(PatientADT p1) {
		super(new BorderLayout());
		ID = p1.getId();
		NAME = p1.getName();
		viewPanel = new JPanel();
		viewPanel.setPreferredSize(new Dimension(800, 600));
		viewPanel.setBackground(Color.white);
		viewPanel.setLayout(null);
		viewPanel.setVisible(true);
		
		JLabel lblNewLabel = new JLabel(NAME);
		lblNewLabel.setBounds(85, 47, 63, 14);
		viewPanel.add(lblNewLabel);
		
		JLabel lblId = new JLabel(ID);
		lblId.setBounds(85, 61, 81, 20);
		viewPanel.add(lblId);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(46, 47, 49, 14);
		viewPanel.add(lblName);
		
		JLabel lblId_1 = new JLabel("ID:");
		lblId_1.setBounds(46, 64, 15, 14);
		viewPanel.add(lblId_1);
		
		JLabel lblAces = new JLabel("ACEs");
		lblAces.setBounds(102, 88, 46, 14);
		lblAces.setHorizontalAlignment(SwingConstants.CENTER);
		viewPanel.add(lblAces);
		
		JLabel lblRiskFactors = new JLabel("Risk Factors");
		lblRiskFactors.setBounds(316, 88, 72, 14);
		lblRiskFactors.setHorizontalAlignment(SwingConstants.CENTER);
		viewPanel.add(lblRiskFactors);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 101, 155, 188);
		viewPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(274, 101, 155, 188);
		viewPanel.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		for (int i = 0; i<p1.getACEs().size();i++) {
			textArea.setText(textArea.getText() + "\n" + p1.getACEs().get(i) + "\n");
		}
		
		for (int i = 0; i<m1.getRiskFactors(p1.getACEs()).size();i++) {
			textArea_1.setText(textArea_1.getText() + "\n" + m1.getRiskFactors(p1.getACEs()).get(i) + "\n");
		}
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new backListener());
		btnBack.setBounds(10, 11, 89, 23);
		viewPanel.add(btnBack);
		viewPanel.setVisible(true);

				
		viewPanel.setVisible(true);
		setVisible(true);
		add(viewPanel);
		
	}
	
	private class backListener implements ActionListener {
		private ViewEditPanel vieweditpanel;
		
		public void actionPerformed(ActionEvent e) {
			viewPanel.setVisible(false);
			vieweditpanel = new ViewEditPanel();
			add(vieweditpanel);
		}
	}
}
