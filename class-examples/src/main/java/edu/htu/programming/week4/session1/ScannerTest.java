package edu.htu.programming.week4.session1;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter number 1: ");
		int n1=scanner.nextInt();
		
		System.out.println("Please enter number 2: ");
		int n2=scanner.nextInt();
		
		System.out.println(n1+n2);
	}
}
