package edu.htu.programming.week10.session1;

import java.util.Scanner;

public class MyArrayUtil {
	public static void main(String[] args) {
		int arr1[] = readArray();
		printArray(arr1);

	}

	////////////////////////////////////////////////////////
	// function / method
	public static int[] readArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter array size: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		// reading array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter value at: " + i);
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	////////////////////////////////////////////////////////
	public static void printArray(int arr[]) {
		System.out.println("======================================");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Item at index " + i + " = " + arr[i]);
		}
	}

	public static int findMaxValue(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMinValue(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}//end of if
		}//end of for
		return min;
	}//end of function

	public static int calculateArraySum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
