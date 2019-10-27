//John Armstrong
//Project 2
package project1;


import java.awt.Dimension;

import javax.swing.JFrame;

//class that creates the frame that panels are then added to, the frame is the heavy weight component that talks to the operating system for default layout

public class MainFrame {
	
    JFrame frame;

    
	public static void main(String[] args) {
		AceDataManagerADT m1 = new AceDataManager("./project1/data.txt","./data.txt");
		m1.getAceList();
		JFrame frame = new JFrame("Armstrong Clinic");
		frame.setPreferredSize(new Dimension(800,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		System.out.println("");
		
		MainPanel MainPanel = new MainPanel();
		frame.add(MainPanel);
		
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		
		

		
	}
	

}


