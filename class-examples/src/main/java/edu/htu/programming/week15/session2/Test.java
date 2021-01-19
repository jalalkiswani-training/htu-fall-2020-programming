package edu.htu.programming.week15.session2;

public class Test {
	public static void main(String[] args) {
		int x = 10;
		int y = 50;
		int j = 100;
		String s=sayHello("Ata 1");
		System.out.println(s);
		x+=50;
		int sum = x + y * j;
		System.out.println(sum);
		sum-=10;
		y++;
		System.out.println(y);
		System.out.println(sum);
		System.out.println(x);
	}
	
	public static String sayHello(String name) {
		String msg="Hi, "+name;
		return msg;
	}
}