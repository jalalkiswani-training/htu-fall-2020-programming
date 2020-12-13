package edu.htu.programming.week10.session1;

import java.util.Scanner;

public class Function1 {
	public static void main(String[] args) {
		x();
		int sum=add(5, 10);
		System.out.println(sum);
		x();
	}

	/**
	 * Public: visibility modifier??
	 * static: can be called directly without reference ??
	 * void: this function returns no value
	 * x: function/method name
	 * (): Parameters
	 */
	public static void x() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the item price: ");
		int price = s.nextInt();
		System.out.println("Are you in Aqaba: ");
		boolean aqaba=s.nextBoolean();
		double rate=.16;
		if(aqaba==true) {
			rate=.08;
		}
		double salesTax = price * rate;

		System.out.println("Sales tax = " + salesTax);
		System.out.println("Final Amount Afer Tax = " + (price+salesTax));	
	}

	// this function should return an int value
	public static int add(int n1, int n2) {
		int s = n1 + n2;
		return s;
	}
}
