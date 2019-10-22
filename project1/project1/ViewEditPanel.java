//John Armstrong
//Project 2
package project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ViewEditPanel extends JPanel {
	private final int WIDTH = 800, HEIGHT = 500;
	private JPanel vieweditpanel;
	private JTextField textField;
	private viewPanel viewpanel;
	private editPat editPanel;
	private MainPanel mainPanel;
	AceDataManagerADT m1 = new AceDataManager("./project1/data.txt","./data.txt");
	
	public ViewEditPanel() {
		super(new BorderLayout());
		setVisible(true);
		vieweditpanel = new JPanel();
		vieweditpanel.setLayout(null);
		vieweditpanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		vieweditpanel.setBackground(Color.white);
		JLabel lblNewLabel = new JLabel("Enter ID of patient you would like to view or edit:");
		lblNewLabel.setBounds(10, 102, 293, 14);
		vieweditpanel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(280, 99, 86, 20);
		vieweditpanel.add(textField);
		textField.setColumns(10);	

		JLabel lblPressViewOr = new JLabel("Press view or edit:");
		lblPressViewOr.setBounds(58, 151, 111, 20);
		vieweditpanel.add(lblPressViewOr);


		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new editListener());
		btnEdit.setBounds(174, 150, 85, 23);
		vieweditpanel.add(btnEdit);

		JButton btnView = new JButton("View");
		btnView.addActionListener(new viewListener());
		btnView.setBounds(269, 150, 86, 23);
		vieweditpanel.add(btnView);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new backListener());
		btnBack.setBounds(10, 11, 89, 23);
		vieweditpanel.add(btnBack);
		
		add(vieweditpanel);
		vieweditpanel.setVisible(true);



	}

	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			vieweditpanel.setVisible(false);
			mainPanel = new MainPanel();
			add(mainPanel);
		}
	}
	
	private class viewListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			vieweditpanel.setVisible(false);
			PatientADT p1 = m1.getPatient(textField.getText());
			System.out.println(p1);
			viewpanel = new viewPanel(p1);
			add(viewpanel);
			viewpanel.setVisible(true);


		}


	}
	
	private class editListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			vieweditpanel.setVisible(false);
			editPanel = new editPat(textField.getText());
			add(editPanel);
			editPanel.setVisible(true);
			
		}
	}
}