package edu.htu.programming.week15.session1;

//Person: is a class 
public class Person {
	//these are methods that could be only called using a reference
	//because they are non-static
	//in OOP: attributes
	//in Java: instance variables
	String name;
	int age;

	//this is a method that could be only called using a refernce
	//because it is non-static
	//in OOP: operations
	//Java: methods
	public void sayHello() {
		System.out.println("Hello my name is : " + name);
	}
	
	//this is a static method that could be called directly
	//using the class name Person.add(5,10)
	public static int add(int n1, int n2) {
		return n1+n2;
	}
}
