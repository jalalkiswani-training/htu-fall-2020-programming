package edu.htu.programming.week15.session1;

public class Test {
	public static void main(String[] args) {
		//Person: data type
		//p: variable (reference)
		//new Person() : construction
		Person p=new Person();
		p.name="Ata";
		p.age=12;		
		p.sayHello();//Ata
		
		Person p2=new Person();
		p2.name="Essa";
		p2.age=30;
		p2.sayHello();//Essa
		
		Person p3=new Person();
		p3.name="Kamal";
		p3.age=20;
		p3.sayHello();
		
	}	
}
