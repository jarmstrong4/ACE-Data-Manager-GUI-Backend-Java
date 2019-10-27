//John Armstrong
//Project 2
package project1;


//this is the panel added to the frame when the user selects to edit a patient
//here the user can change the name of the patient, but not the ID
//also, a list of the patients current ACEs will be available for reference while the user is able to add ACEs using check boxes
//data is written to the back-end text file when the user presses save
//user is returned to MainPanel after save

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class editPat extends JPanel{
	private JPanel editpanel;
	AceDataManagerADT m1 = new AceDataManager("./project1/data.txt","./data.txt");
	private JTextField textField_1;
	private JPanel vieweditpanel;
	private ArrayList<String> Currentaces;
	private ArrayList<String> aces;
	PatientADT testparameter;
	private JPanel MainPanel;
	private JLabel lblNewLabel;
	private String ID;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public editPat(String id) {
		super(new BorderLayout());
		ID = id;
		editpanel = new JPanel();

		editpanel.setLayout(null);
		editpanel.setBounds(0, 1, 800,500);
		editpanel.setVisible(true);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new backListener());

		btnBack.setBounds(10, 5, 55, 23);
		editpanel.add(btnBack);
		
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(145, 95, 15, 14);
		editpanel.add(lblId);
		
		lblNewLabel = new JLabel(id);
		lblNewLabel.setBounds(190, 95, 55, 14);
		editpanel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(145, 120, 39, 14);
		editpanel.add(lblName);
		
		textField_1 = new JTextField(m1.getPatient(id).getName());
		textField_1.setBounds(190, 117, 86, 20);
		editpanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAces = new JLabel(m1.getPatient(id).getName() + "'s current ACEs:");
		lblAces.setBounds(342, 95, 167, 14);
		editpanel.add(lblAces);
		add(editpanel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(295, 117, 280, 20);
		
		aces = new ArrayList();
		Currentaces = new ArrayList();
		Currentaces = m1.getPatient(id).getACEs();

		comboBox.setModel(new DefaultComboBoxModel(Currentaces.toArray()));
		editpanel.add(comboBox);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Physical abuse");
		chckbxNewCheckBox.addActionListener(new PhysAbuseListener());
		chckbxNewCheckBox.setBounds(180, 176, 136, 23);
		editpanel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 =  new JCheckBox("Emotional neglect");
		chckbxNewCheckBox_1.addActionListener(new EmotNeglectListener());
		chckbxNewCheckBox_1.setBounds(180, 228, 136, 23);
		editpanel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Sexual abuse");
		chckbxNewCheckBox_2.addActionListener(new SexAbuse());
		chckbxNewCheckBox_2.setBounds(180, 202, 136, 23);
		editpanel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Parental seperation or divorce");
		chckbxNewCheckBox_3.addActionListener(new ParenSeperation());
		chckbxNewCheckBox_3.setBounds(318, 202, 214, 23);
		editpanel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Exposure to domestic violence");
		chckbxNewCheckBox_4.addActionListener(new DomVioExpo());
		chckbxNewCheckBox_4.setBounds(318, 228, 214, 23);
		editpanel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Household mental illness");
		chckbxNewCheckBox_5.addActionListener(new HouseMental());
		chckbxNewCheckBox_5.setBounds(318, 176, 214, 23);
		editpanel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Physical neglect");
		chckbxNewCheckBox_6.addActionListener(new PhysNeglect());
		chckbxNewCheckBox_6.setBounds(180, 280, 136, 23);
		editpanel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Emotional abuse");
		chckbxNewCheckBox_7.addActionListener(new EmoAbuse());
		chckbxNewCheckBox_7.setBounds(180, 254, 136, 23);
		editpanel.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Household substance abuse");
		chckbxNewCheckBox_8.addActionListener(new SubAbuse());
		chckbxNewCheckBox_8.setBounds(318, 254, 214, 23);
		editpanel.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Incarcerated household member");
		chckbxNewCheckBox_9.addActionListener(new IncarHouseMem());
		chckbxNewCheckBox_9.setBounds(318, 280, 214, 23);
		editpanel.add(chckbxNewCheckBox_9);
		
		JLabel lblCheckTheAces = new JLabel("Check the ACE's you would like to add:");
		lblCheckTheAces.setBounds(217, 148, 220, 14);
		editpanel.add(lblCheckTheAces);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new SaveActionListener());
		btnSave.setBounds(318, 328, 120, 43);
		editpanel.add(btnSave);
		
		JButton btnNewButton = new JButton("Delete Patient");
		btnNewButton.setBounds(180, 328, 120, 43);
		editpanel.add(btnNewButton);
		btnNewButton.addActionListener(new DeleteListener());
		editpanel.setVisible(true);
		

	}
	
	private class DeleteListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			m1.RemovePatient(m1.getPatient(ID));
			editpanel.setVisible(false);
			vieweditpanel = new ViewEditPanel();
			add(vieweditpanel);
			vieweditpanel.setVisible(true);
			m1.writeToFile();
			JOptionPane.showMessageDialog(null, "Patient will be deleted when application is closed or the next time the patient is viewed.	");
			System.out.println("");
		}
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
			vieweditpanel.setVisible(true);
		}
	}
	private class SaveActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			
			for (int i = 0; i < aces.size(); i++) {
				m1.getPatient(lblNewLabel.getText()).addACE(aces.get(i));
			}
			

			
			editpanel.setVisible(false);
			MainPanel = new MainPanel();
			add(MainPanel);
			m1.writeToFile();
			JOptionPane.showMessageDialog(null, "Patient changes were saved and written");
			
			
			
		}
	}
}
