package edu.htu.programming.week13.session1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUICalc {
	public static void main(String[] args) {
		JFrame frm=new JFrame();
		frm.setSize(350,200);
		
		frm.setLocationRelativeTo(null);
		frm.setTitle("Simple Calculator");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblN1=new JLabel("Number 1"); 
		JTextField txtN1=new JTextField(20);
		
		JLabel lblN2=new JLabel("Number 2");
		JTextField txtN2=new JTextField(20);
		
		JButton btnAdd=new JButton("Add");
		btnAdd.setPreferredSize(new Dimension(300, 30));
		
		JLabel lblResult=new JLabel("Result");
		JTextField txtResult=new JTextField(20);
		txtResult.setEditable(false);
		
		JPanel pnl=new JPanel();
		pnl.add(lblN1);
		pnl.add(txtN1);
		
		pnl.add(lblN2);		
		pnl.add(txtN2);
		pnl.add(btnAdd);
		pnl.add(lblResult);
		pnl.add(txtResult);
		
		frm.add(pnl);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//code to execute when the user clicks on the button
				int n1= Integer.parseInt(txtN1.getText());
				int n2=Integer.parseInt(txtN2.getText());
				int result=n1+n2;
				txtResult.setText(result+"");
			}
		});
		
		frm.setVisible(true);				
	}
}
