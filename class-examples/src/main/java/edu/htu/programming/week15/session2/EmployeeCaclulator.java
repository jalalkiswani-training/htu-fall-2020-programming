package edu.htu.programming.week15.session2;

//Class name (Camel Case): Each word start with capital letter including the first word
//Noun
public class EmployeeCaclulator {
	// camel case with small first: noun
	String employeeName;
	int basicSalary;
	int dedutions;
	int allownces;

	// camel case with small first, imperative verb
	public int calculateEmployeeSalary() {
		int finalSalary = basicSalary + allownces - dedutions;
		return finalSalary;
	}

}
