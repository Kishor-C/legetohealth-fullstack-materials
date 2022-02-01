package com.org.dao;

import org.springframework.stereotype.Repository;

// the below annotations enable spring to create the instance in the IOC, default id will be classname, but begins with lowercase
// i.e., employeeJdbcImpl is the bean id for this
@Repository
public class EmployeeJdbcImpl implements EmployeeDao {

	public EmployeeJdbcImpl() {
		System.out.println("----EmployeeJdbcImpl created----");
	}
	@Override
	public void store() {
		System.out.println("---store() called on EmployeeJdbcImpl---");
	}

	@Override
	public void delete() {
		System.out.println("---delete() called on EmployeeJdbcImpl----");
	}

}
