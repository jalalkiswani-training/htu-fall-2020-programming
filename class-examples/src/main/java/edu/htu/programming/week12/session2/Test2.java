package edu.htu.programming.week12.session2;

import java.util.Scanner;

//Time complexity : O(n) : order of N
public class Test2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum+=i;
		}
	}
}
