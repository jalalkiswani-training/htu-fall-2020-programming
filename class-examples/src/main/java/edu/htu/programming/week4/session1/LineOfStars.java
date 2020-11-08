package edu.htu.programming.week4.session1;

import javax.swing.JOptionPane;

/*
 * This is a 
 * Multi-line
 * Comment
 */
public class LineOfStars {
	public static void main(String[] args) {
		// System.out.println("************************************************************");
		String value=JOptionPane.showInputDialog("Please enter number : ");
		int n=Integer.parseInt(value);//convert from String to integer
		// Horizontal line
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println("\n==========================");

		// Vertical line
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}

		System.out.println("\n==========================");
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
