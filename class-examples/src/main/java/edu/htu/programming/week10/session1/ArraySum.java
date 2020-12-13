package edu.htu.programming.week10.session1;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr = MyArrayUtil.readArray();
		int max=MyArrayUtil.findMaxValue(arr);
		int min=MyArrayUtil.findMinValue(arr);
		int sum=MyArrayUtil.calculateArraySum(arr);
		
		int sumExMax=sum-max;
		int sumExMin=sum-min;
		
		System.out.println("Max= "+max);
		System.out.println("Min= "+min);
		System.out.println("Sum = "+sum);			
		System.out.println("Sum Ex Max: "+sumExMax);
		System.out.println("Sum Ex Min: "+sumExMin);
		
		MyArrayUtil.printArray(arr);
	}
}
