package com.examples.dao;

import java.util.List;

import com.examples.beans.Employee;
import com.examples.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {
	// takes employee & returns id or status
	public int store(Employee employee);
	// takes id & returns Employee if id is found else throws exception
	public Employee findById(int id) throws EmployeeNotFoundException;
	// return all the employees in a List
	public List<Employee> findAll();
	// update salary based on id
	public void update(int id, double salary)throws EmployeeNotFoundException;
}
