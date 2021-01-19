package edu.htu.programming.week15.session2;

public class LoopDebug {
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		int x=40;
		int y=20;
		System.out.println(x+y);
		for (int i = 0; i < 50; i++) {
			String msg = "Hello from uncle Jalal : " + i;
			System.out.println(msg);
		}
	}
}
