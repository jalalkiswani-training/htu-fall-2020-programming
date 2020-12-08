package edu.htu.programming.week8.session2;

public class Arrays1 {
	public static void main(String[] args) {
		//int datatype of each time
		//arr array variable name
		//[] to inform that the variable is an array
		//new int[10] to allocate required size and space for the array
		int arr[]=new int[30];
		System.out.println("The array length is :"+arr.length);
		
		arr[5]=20;
		System.out.println(arr[0]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("The value at index ["+i+"] is "+arr[i]);			
		}		
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
//		System.out.println(arr[9]);
	}
}
