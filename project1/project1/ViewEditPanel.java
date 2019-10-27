//John Armstrong

//Project 2

package project1;



import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


//this is the panel added if the user selects to view or edit a patient


@SuppressWarnings("serial")
public class ViewEditPanel extends JPanel {

	private final int WIDTH = 800, HEIGHT = 500;

	private JPanel vieweditpanel;

	private viewPanel viewpanel;

	private editPat editPanel;

	private MainPanel mainPanel;

	public JLabel retryLabel;
	
	@SuppressWarnings("rawtypes")
	public JComboBox comboBox;


	AceDataManagerADT m1;



	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ViewEditPanel() {

		super(new BorderLayout());
		m1 = new AceDataManager("./project1/data.txt","./data.txt");
		setVisible(true);

		vieweditpanel = new JPanel();

		vieweditpanel.setLayout(null);

		vieweditpanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));

		vieweditpanel.setBackground(Color.white);

		JLabel lblNewLabel = new JLabel("Select the ID of patient you would like to view or edit:");

		lblNewLabel.setBounds(81, 174, 329, 14);

		vieweditpanel.add(lblNewLabel);

		System.out.println("");



		JButton btnEdit = new JButton("Edit");

		btnEdit.addActionListener(new editListener());

		btnEdit.setBounds(234, 230, 132, 43);

		vieweditpanel.add(btnEdit);



		JButton btnView = new JButton("View");

		btnView.addActionListener(new viewListener());

		btnView.setBounds(376, 230, 132, 43);

		vieweditpanel.add(btnView);



		JButton btnBack = new JButton("Back");

		btnBack.addActionListener(new backListener());

		btnBack.setBounds(10, 11, 89, 23);

		vieweditpanel.add(btnBack);

		retryLabel = new JLabel("INVALID ID, PRESS ANY KEY TO CONTINUE");
		retryLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		retryLabel.setBounds(184, 184, 304, 174);



		add(vieweditpanel);
		
		comboBox = new JComboBox();
		comboBox.setBounds(400, 171, 108, 20);
		comboBox.setModel(new DefaultComboBoxModel(m1.getAllIDs().toArray()));
		vieweditpanel.add(comboBox);




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


				if (m1.getPatient(comboBox.getSelectedItem().toString()) == null) {
					JOptionPane.showMessageDialog(null, "ID no longer exists, patient was deleted.\n" + "Select a different ID" );
				}
				else {
				vieweditpanel.setVisible(false);													// if ID does exist, pull that patient's info from data manager 
																									//and pass it to the next panel, viewPanel
				PatientADT p1 = m1.getPatient(comboBox.getSelectedItem().toString());									

				viewpanel = new viewPanel(p1);											

				add(viewpanel);

				viewpanel.setVisible(true);

				}
			}


		}


	




	private class editListener implements ActionListener{

		public void actionPerformed(ActionEvent event) {
			

			vieweditpanel.setVisible(false);

			editPanel = new editPat(comboBox.getSelectedItem().toString());

			add(editPanel);

			editPanel.setVisible(true);
			}



		}

	}
	
	
