package edu.htu.programming.week13.session1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest {
	
	public static void main(String[] args) {
		JFrame frm=new JFrame();
		frm.setTitle("First GUI Frame in Java");
		frm.setSize(420, 100);//Pixel
//		frm.setExtendedState(JFrame.MAXIMIZED_BOTH);//fill screen
		frm.setLocationRelativeTo(null);//center the Frame on screen
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the app when closing the frame
		
		JPanel pnl=new JPanel();
		
		JLabel lbl=new JLabel("Your Name");
		JTextField txt=new JTextField(20);
		
		JButton btnHello=new JButton("Say Hello");
		
		btnHello.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=txt.getText();
				JOptionPane.showMessageDialog(null,"Hi, "+name);
			}
		});
		
		pnl.add(lbl);
		pnl.add(txt);
		pnl.add(btnHello);
		
		frm.add(pnl);
		
		frm.setVisible(true);
	}
	
}
