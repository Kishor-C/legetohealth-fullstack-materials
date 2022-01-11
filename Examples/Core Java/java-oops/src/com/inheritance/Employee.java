package com.inheritance;
// Employee class inherits setName, getName, setGender, getGender
public class Employee extends Person {
	private int employeeId;
	private double salary;
	
	public Employee(int employeeId, String name, String gender, double salary) {
		super(name, gender); // calls Person(String, String)
		this.employeeId = employeeId;
		this.salary = salary;
		System.out.println("Employee(int, String, String, double) constructor");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	// method overriding
	public void printInfo() {
		super.printInfo();
		System.out.println("Id = "+employeeId+", Salary = "+salary);
	}
}
