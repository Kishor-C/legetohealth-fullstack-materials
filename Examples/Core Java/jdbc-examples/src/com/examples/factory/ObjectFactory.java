package com.examples.factory;

import com.examples.dao.EmployeeDao;
import com.examples.dao.EmployeeDaoImpl;

public class ObjectFactory {
	public static EmployeeDao getInstance() {
		return new EmployeeDaoImpl();
	}
}
