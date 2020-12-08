package edu.htu.programming.week8.session2;

public class Arrays2 {
	public static void main(String[] args) {
		int arr[]=new int[30];
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=1;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("The value at index ["+i+"] is "+arr[i]);			
		}		
	}
}
