//John Armstrong

//Project 2

package project1;

//this is the first panel to be added to the frame, as it is the menu screen for selecting whether the user wants to add, view, or edit a patient.

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	

	private final int WIDTH = 800, HEIGHT = 500;

	

	private JPanel choicePanel;

	private JPanel addPanel;

	private ViewEditPanel ViewEditPanel;

	private JButton viewEdit;

	private JButton addPat;



	public MainPanel() {

		super(new BorderLayout());

		choicePanel = new JPanel();

		choicePanel.setBackground(Color.white);
		
		choicePanel.setLayout(null);

		

		choicePanel.setLayout(null);

		choicePanel.setBounds(0,0,WIDTH,HEIGHT);

		addPat = new JButton("Add a Patient");

		addPat.setBounds(241, 223, 187, 55);

		addPat.addActionListener(new addActionListener());

		

		viewEdit = new JButton("View/Edit a patient");

		viewEdit.setBounds(241, 140, 187, 55);

		viewEdit.addActionListener(new viewEditListener());

		

		choicePanel.add(viewEdit);

		choicePanel.add(addPat);

		

		JLabel lblNewLabel = new JLabel("New label");

		lblNewLabel.setIcon(new ImageIcon(MainPanel.class.getResource("/project1/backgroundpng.png")));

		lblNewLabel.setBounds(-12, 0, 1135, 500);

		choicePanel.add(lblNewLabel);

		add(choicePanel);

		choicePanel.setVisible(true);

	}



	private class viewEditListener implements ActionListener {



		

		public void actionPerformed(ActionEvent event) {

			choicePanel.setVisible(false);

			ViewEditPanel = new ViewEditPanel();

			add(ViewEditPanel);


		}

		

	}

	

	private class addActionListener implements ActionListener{

		public void actionPerformed(ActionEvent event) {

			choicePanel.setVisible(false);

			addPanel = new addPatient();
			System.out.println("");
			add(addPanel);

		}

	}

}