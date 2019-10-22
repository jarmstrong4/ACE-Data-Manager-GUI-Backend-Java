//John Armstrong
//Project 2
package project1;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class editPat extends JPanel{
	private JTextField textField;
	private JPanel editpanel;
	AceDataManagerADT m1 = new AceDataManager("./project1/data.txt","./data.txt");
	private JTextField textField_1;
	private ViewEditPanel vieweditpanel;
	private ArrayList<String> Currentaces;
	private ArrayList<String> aces;
	PatientADT testparameter;
	private JPanel MainPanel;
	private JLabel lblNewLabel;
	
	public editPat(String id) {
		super(new BorderLayout());
		editpanel = new JPanel();
		editpanel.setLayout(null);
		editpanel.setBounds(0, 0, 800,500);
		editpanel.setVisible(true);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new backListener());
		btnBack.setBounds(10, 5, 55, 23);
		editpanel.add(btnBack);
		
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 45, 15, 14);
		editpanel.add(lblId);
		
		lblNewLabel = new JLabel(id);
		lblNewLabel.setBounds(55, 45, 55, 14);
		editpanel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 70, 39, 14);
		editpanel.add(lblName);
		
		textField_1 = new JTextField(m1.getPatient(id).getName());
		textField_1.setBounds(55, 67, 86, 20);
		editpanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAces = new JLabel(m1.getPatient(id).getName() + "'s current ACEs:");
		lblAces.setBounds(207, 45, 167, 14);
		editpanel.add(lblAces);
		editpanel.setVisible(true);
		add(editpanel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 67, 280, 20);
		
		aces = new ArrayList();
		Currentaces = new ArrayList();
		Currentaces = m1.getPatient(id).getACEs();
		String[] allaces = m1.getAceList();
		comboBox.setModel(new DefaultComboBoxModel(Currentaces.toArray()));
		editpanel.add(comboBox);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Physical abuse");
		chckbxNewCheckBox.addActionListener(new PhysAbuseListener());
		chckbxNewCheckBox.setBounds(45, 126, 136, 23);
		editpanel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 =  new JCheckBox("Emotional neglect");
		chckbxNewCheckBox_1.addActionListener(new EmotNeglectListener());
		chckbxNewCheckBox_1.setBounds(45, 178, 136, 23);
		editpanel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Sexual abuse");
		chckbxNewCheckBox_2.addActionListener(new SexAbuse());
		chckbxNewCheckBox_2.setBounds(45, 152, 136, 23);
		editpanel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Parental seperation or divorce");
		chckbxNewCheckBox_3.addActionListener(new ParenSeperation());
		chckbxNewCheckBox_3.setBounds(183, 152, 214, 23);
		editpanel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Exposure to domestic violence");
		chckbxNewCheckBox_4.addActionListener(new DomVioExpo());
		chckbxNewCheckBox_4.setBounds(183, 178, 214, 23);
		editpanel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Household mental illness");
		chckbxNewCheckBox_5.addActionListener(new HouseMental());
		chckbxNewCheckBox_5.setBounds(183, 126, 214, 23);
		editpanel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Physical neglect");
		chckbxNewCheckBox_6.addActionListener(new PhysNeglect());
		chckbxNewCheckBox_6.setBounds(45, 230, 136, 23);
		editpanel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Emotional abuse");
		chckbxNewCheckBox_7.addActionListener(new EmoAbuse());
		chckbxNewCheckBox_7.setBounds(45, 204, 136, 23);
		editpanel.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Household substance abuse");
		chckbxNewCheckBox_8.addActionListener(new SubAbuse());
		chckbxNewCheckBox_8.setBounds(183, 204, 214, 23);
		editpanel.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Incarcerated household member");
		chckbxNewCheckBox_9.addActionListener(new IncarHouseMem());
		chckbxNewCheckBox_9.setBounds(183, 230, 214, 23);
		editpanel.add(chckbxNewCheckBox_9);
		
		JLabel lblCheckTheAces = new JLabel("Check the ACE's you would like to add:");
		lblCheckTheAces.setBounds(82, 98, 220, 14);
		editpanel.add(lblCheckTheAces);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new SaveActionListener());
		btnSave.setBounds(310, 260, 89, 23);
		editpanel.add(btnSave);
		

	}
	private class PhysAbuseListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Physical abuse");
		}
	}
	
	private class EmotNeglectListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Emotional neglect");
		}
	}
	
	private class SexAbuse implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Sexual abuse");
		}
	}
	
	private class ParenSeperation implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Parental seperation or divorce");
		}
	}
	
	private class DomVioExpo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Exposure to domestic violencee");
		}
	}
	
	private class HouseMental implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Household mental illness");
		}
	}
	private class PhysNeglect implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Physical neglect");
		}
	}
	
	private class EmoAbuse implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Emotional abuse");
		}
	}
	
	private class SubAbuse implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Household substance abuse");
		}
	}
	
	private class IncarHouseMem implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			aces.add("Incarcerated household member");
		}
	}
	
	private class backListener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			editpanel.setVisible(false);
			vieweditpanel = new ViewEditPanel();
			add(vieweditpanel);
		}
	}
	private class SaveActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			
			for (int i = 0; i < aces.size(); i++) {
				m1.getPatient(lblNewLabel.getText()).addACE(aces.get(i));
			}
			
			//aces.removeAll(aces);
			
			editpanel.setVisible(false);
			MainPanel = new MainPanel();
			add(MainPanel);
			m1.writeToFile();
			System.out.println("Patient edited and changes have been written");
			
			
			
		}
	}
}
