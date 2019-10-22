//John Armstrong
//Project 2
package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class addPatient extends JPanel{
	private JPanel addPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel MainPanel;
	PatientADT testparameter;
	ArrayList<String> ACEs = new ArrayList();
	AceDataManagerADT m1 = new AceDataManager("./project1/data.txt","./data.txt");

	public addPatient() {
		addPanel = new JPanel();
		addPanel.setBounds(0, 0, 800, 500);
		//addPanel.setBounds(0, 0, 450, 300);
		addPanel.setPreferredSize(new Dimension(800, 500));
		addPanel.setBackground(Color.white);
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 5, 55, 23);
		btnBack.addActionListener(new backListener());
		setLayout(null);
		addPanel.setLayout(null);
		addPanel.add(btnBack);
		
		JLabel lblAddPatient = new JLabel("ADD PATIENT");
		lblAddPatient.setBounds(145, 5, 150, 35);
		lblAddPatient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addPanel.add(lblAddPatient);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(28, 77, 23, 14);
		addPanel.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(48, 74, 86, 20);
		addPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(48, 115, 86, 20);
		addPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(5, 118, 46, 14);
		addPanel.add(lblName);
		add(addPanel);
		
		JLabel lblAces = new JLabel("ACEs");
		lblAces.setBounds(249, 52, 46, 14);
		addPanel.add(lblAces);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Physical abuse");
		chckbxNewCheckBox.addActionListener(new PhysAbuseListener());
		chckbxNewCheckBox.setBounds(145, 73, 115, 23);
		addPanel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 =  new JCheckBox("Emotional neglect");
		chckbxNewCheckBox_1.addActionListener(new EmotNeglectListener());
		chckbxNewCheckBox_1.setBounds(145, 126, 115, 23);
		addPanel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Sexual abuse");
		chckbxNewCheckBox_2.addActionListener(new SexAbuse());
		chckbxNewCheckBox_2.setBounds(145, 99, 115, 23);
		addPanel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Parental seperation or divorce");
		chckbxNewCheckBox_3.addActionListener(new ParenSeperation());
		chckbxNewCheckBox_3.setBounds(262, 99, 182, 23);
		addPanel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Exposure to domestic violence");
		chckbxNewCheckBox_4.addActionListener(new DomVioExpo());
		chckbxNewCheckBox_4.setBounds(262, 126, 182, 23);
		addPanel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Household mental illness");
		chckbxNewCheckBox_5.addActionListener(new HouseMental());
		chckbxNewCheckBox_5.setBounds(262, 73, 182, 23);
		addPanel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Physical neglect");
		chckbxNewCheckBox_6.addActionListener(new PhysNeglect());
		chckbxNewCheckBox_6.setBounds(145, 178, 115, 23);
		addPanel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Emotional abuse");
		chckbxNewCheckBox_7.addActionListener(new EmoAbuse());
		chckbxNewCheckBox_7.setBounds(145, 152, 115, 23);
		addPanel.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Household substance abuse");
		chckbxNewCheckBox_8.addActionListener(new SubAbuse());
		chckbxNewCheckBox_8.setBounds(262, 152, 182, 23);
		addPanel.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Incarcerated household member");
		chckbxNewCheckBox_9.addActionListener(new IncarHouseMem());
		chckbxNewCheckBox_9.setBounds(262, 178, 182, 23);
		addPanel.add(chckbxNewCheckBox_9);
		
		JButton btnNewButton = new JButton("Save patient");
		btnNewButton.addActionListener(new SaveActionListener());
	
		btnNewButton.setBounds(123, 227, 172, 35);
		addPanel.add(btnNewButton);
		
		
	}
	
	private class PhysAbuseListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Physical abuse");
		}
	}
	
	private class EmotNeglectListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Emotional neglect");
		}
	}
	
	private class SexAbuse implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Sexual abuse");
		}
	}
	
	private class ParenSeperation implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Parental seperation or divorce");
		}
	}
	
	private class DomVioExpo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Exposure to domestic violencee");
		}
	}
	
	private class HouseMental implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Household mental illness");
		}
	}
	private class PhysNeglect implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Physical neglect");
		}
	}
	
	private class EmoAbuse implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Emotional abuse");
		}
	}
	
	private class SubAbuse implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Household substance abuse");
		}
	}
	
	private class IncarHouseMem implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ACEs.add("Incarcerated household member");
		}
	}
	
	private class backListener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			addPanel.setVisible(false);
			MainPanel = new MainPanel();
			//add(MainPanel);
		}
	}
	
	private class SaveActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			testparameter = new Patient();
			testparameter.setId(textField.getText());
			testparameter.setName(textField_1.getText());
			for (int i = 0; i < ACEs.size(); i++) {
				testparameter.addACE(ACEs.get(i));
			}
			
			m1.addPatient(testparameter);
			ACEs.removeAll(ACEs);
			
			addPanel.setVisible(false);
			MainPanel = new MainPanel();
			add(MainPanel);
			
			m1.writeToFile();
			System.out.println("New patient added and written");
			
			
			
			
		}
	}
}
