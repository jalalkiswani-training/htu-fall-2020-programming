package edu.htu.programming.week12.session2;

import java.util.Scanner;

//Time complexity : O(n*n)
public class Test3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int sum=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum+=i;				
			}
		}
	}
}
