package edu.htu.programming.week11.session2;

import javax.swing.JOptionPane;

public class Test2 {
	public static void main(String[] args) {
		Test.method1();
		int n1=Test3.readNumber();
		int n2=Test3.readNumber();
		int n3=Test3.readNumber();
		
		System.out.println(sum(n1, n2, n3));
		
		
	}

	public static int sum(int n1, int n2, int n3) {
		int value = n1 + n2 + n3;
		return value;
	}
	
	
}
