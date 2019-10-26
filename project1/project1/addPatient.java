//John Armstrong
//Project 2
package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;


//this panel is added to the frame when the user selects add patient
//Patient must have Name an ID to be a patient



@SuppressWarnings("serial")
public class addPatient extends JPanel{
	private JPanel addPanel;
	private JTextField textField;
	private JTextField textField_1;
	private MainPanel MainPanel;
	PatientADT testparameter;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	ArrayList<String> ACEs = new ArrayList();
	AceDataManagerADT m1 = new AceDataManager("./project1/data.txt","./data.txt");


	public addPatient() {
		super(new BorderLayout());
		addPanel = new JPanel();
		addPanel.setLayout(null);
		addPanel.setBounds(0, 0, 800, 500);
		addPanel.setVisible(true);
		//addPanel.setBounds(0, 0, 450, 300);
		addPanel.setPreferredSize(new Dimension(800, 500));
		addPanel.setBackground(Color.white);
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 5, 78, 20);
		btnBack.addActionListener(new backListener());
		//setLayout(null);
		addPanel.add(btnBack);
		
		JLabel lblAddPatient = new JLabel("ADD PATIENT");
		lblAddPatient.setBounds(296, 34, 150, 35);
		lblAddPatient.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addPanel.add(lblAddPatient);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(87, 176, 23, 14);
		addPanel.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(109, 173, 116, 20);
		addPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 217, 116, 20);
		addPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(69, 220, 46, 14);
		addPanel.add(lblName);
		add(addPanel);
		
		JLabel lblAces = new JLabel("ACEs");
		lblAces.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAces.setBounds(433, 115, 71, 23);
		addPanel.add(lblAces);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Physical abuse");
		chckbxNewCheckBox.addActionListener(new PhysAbuseListener());
		chckbxNewCheckBox.setBounds(331, 144, 115, 23);
		addPanel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 =  new JCheckBox("Emotional neglect");
		chckbxNewCheckBox_1.addActionListener(new EmotNeglectListener());
		chckbxNewCheckBox_1.setBounds(331, 197, 115, 23);
		addPanel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Sexual abuse");
		chckbxNewCheckBox_2.addActionListener(new SexAbuse());
		chckbxNewCheckBox_2.setBounds(331, 170, 115, 23);
		addPanel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Parental seperation or divorce");
		chckbxNewCheckBox_3.addActionListener(new ParenSeperation());
		chckbxNewCheckBox_3.setBounds(447, 170, 182, 23);
		addPanel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Exposure to domestic violence");
		chckbxNewCheckBox_4.addActionListener(new DomVioExpo());
		chckbxNewCheckBox_4.setBounds(448, 197, 182, 23);
		addPanel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Household mental illness");
		chckbxNewCheckBox_5.addActionListener(new HouseMental());
		chckbxNewCheckBox_5.setBounds(447, 144, 182, 23);
		addPanel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Physical neglect");
		chckbxNewCheckBox_6.addActionListener(new PhysNeglect());
		chckbxNewCheckBox_6.setBounds(331, 249, 115, 23);
		addPanel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Emotional abuse");
		chckbxNewCheckBox_7.addActionListener(new EmoAbuse());
		chckbxNewCheckBox_7.setBounds(331, 223, 115, 23);
		addPanel.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Household substance abuse");
		chckbxNewCheckBox_8.addActionListener(new SubAbuse());
		chckbxNewCheckBox_8.setBounds(447, 223, 182, 23);
		addPanel.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Incarcerated household member");
		chckbxNewCheckBox_9.addActionListener(new IncarHouseMem());
		chckbxNewCheckBox_9.setBounds(447, 249, 182, 23);
		addPanel.add(chckbxNewCheckBox_9);
		
		JButton btnNewButton = new JButton("Save patient");
		btnNewButton.addActionListener(new SaveActionListener());
	
		btnNewButton.setBounds(274, 363, 172, 35);
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
			add(MainPanel);
			
		}
	}
	
	private class SaveActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			if (m1.getPatient(textField.getText()) != null) {
				JOptionPane.showMessageDialog(null, "ID ALREADY IN USE, PLEASE RETRY");
			}
			else if (textField.getText() == null) {
				JOptionPane.showMessageDialog(null, "YOU MUST ENTER AN ID, PLEASE RETRY");
			}
			else if (textField_1.getText() == null) {
				JOptionPane.showMessageDialog(null, "YOU MUST ENTER A NAME, PLEASE RETRY");
			}
			else if (textField_1.getText() == "" & textField.getText() == "") {
				JOptionPane.showMessageDialog(null, "YOU MUST ENTER A NAME AND ID, PLEASE RETRY");
			}
			else {
			
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
}
