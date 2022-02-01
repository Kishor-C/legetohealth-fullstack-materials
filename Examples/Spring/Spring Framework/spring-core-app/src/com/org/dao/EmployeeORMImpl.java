package com.org.dao;

public class EmployeeORMImpl implements EmployeeDao {

	public EmployeeORMImpl() {
		System.out.println("----EmployeeORMImpl created----");
	}
	@Override
	public void store() {
		System.out.println("---store() called on EmployeeORMImpl---");
	}

	@Override
	public void delete() {
		System.out.println("---delete() called on EmployeeORMImpl----");
	}

}
