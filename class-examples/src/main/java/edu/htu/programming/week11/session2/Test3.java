package edu.htu.programming.week11.session2;

import javax.swing.JOptionPane;

public class Test3 {
	public static void main(String[] args) {
		int n1 = readNumber();		
		System.out.println(n1*n1);
	}

	public static int readNumber() {
		String msg=JOptionPane.showInputDialog("Please enter number");
		int n1=Integer.parseInt(msg);
		return n1;
	}
}
