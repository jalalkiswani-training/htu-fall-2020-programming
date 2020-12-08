package edu.htu.programming.week8.session2;

import java.util.Scanner;

public class ValueSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.print("Please enter array size: ");
		int size=s.nextInt();
		
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter number " + (i + 1) + ":");
			arr[i] = s.nextInt();
			sum += arr[i];
		}

		System.out.println("The sum of the values you entered is " + sum);
		System.out.println("The values are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
