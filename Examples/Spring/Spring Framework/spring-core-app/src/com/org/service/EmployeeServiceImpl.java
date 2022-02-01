package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.org.dao.EmployeeDao;

// This annotation enables spring container to instantiate the class
// bean id will be employeeServiceImpl, but you can change using @Service("empService")
@Service
public class EmployeeServiceImpl {
	private EmployeeDao dao;
	
	@Autowired // injects the object of type EmployeeDao
	public EmployeeServiceImpl(@Qualifier(value = "employeeJdbcImpl") EmployeeDao dao) {
		System.out.println("---EmployeeServiceImpl() created---");
		this.dao = dao;
	}
	// usual way to initialize dao through factory pattern
	// EmployeeDao dao = ObjectFactory.getInstance();

	//Setter Injection way of initializing the dao
//	public void setDao(EmployeeDao dao) {
//		this.dao = dao;
//	}
	
	public void save() {
		System.out.println("----save() inside EmployeeService----");
		dao.store();
	}
	public void remove() {
		System.out.println("----remove() inside EmployeeSerivce----");
		dao.delete();
	}
}
