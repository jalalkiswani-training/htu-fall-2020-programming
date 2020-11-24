package edu.htu.programming.week6.session2;

import java.util.Scanner;

//Print the max of three values from user input
public class Algorithm1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number 1");
		int n1 = s.nextInt();
		System.out.println("Please enter number 2");
		int n2 = s.nextInt();
		System.out.println("Please enter number 3");
		int n3 = s.nextInt();

		if (n3 >= n2 && n3 >= n1) {
			System.out.println("Number 3 is the maximum number : " + n3);
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println("Number 2 is the maximum number : " + n2);
		} else if (n1 >= n2 && n1 >= n3) {
			System.out.println("Number 1 is the maximum number : " + n1);
		}
	}
}
