package edu.htu.programming.week8.session1;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0;
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter number " + (i + 1) + ":");
			sum=sum*2;
			int n= s.nextInt();
			sum=sum+n;
		}

		System.out.println(sum);
//		System.out.print("Enter number 2:");
//		int n2=s.nextInt();
//
//		System.out.print("Enter number 3:");
//		int n3=s.nextInt();
//
//		System.out.print("Enter number 4:");
//		int n4=s.nextInt();
//
//		System.out.print("Enter number 5:");
//		int n5=s.nextInt();
//
//		System.out.print("Enter number 6:");
//		int n6=s.nextInt();
//
//		System.out.print("Enter number 7:");
//		int n7=s.nextInt();
//
//		System.out.println("Enter number 8:");
//		int n8=s.nextInt();

//		int sum=n1+n2+n3+n4+n5+n6+n7+n8;
//		System.out.println("Sum ="+sum);//Concatenation
	}
}
