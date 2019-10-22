//John Armstrong
//Project 2
package project1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainFrame {
	public static void main(String[] args) {
		AceDataManagerADT m1 = new AceDataManager("./project1/data.txt","./data.txt");

		JFrame frame = new JFrame("Armstrong Clinic");
		frame.setPreferredSize(new Dimension(800,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		
		
		frame.getContentPane().add(new MainPanel());
		
		frame.pack();
		frame.setVisible(true);
		

		
	}
	

}


