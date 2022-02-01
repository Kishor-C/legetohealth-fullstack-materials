package com.org.service;

import com.org.dao.EmployeeDao;

public class EmployeeServiceImpl {
	private EmployeeDao dao;
	// <constructor-arg> tag can call this argument constructor
	public EmployeeServiceImpl(EmployeeDao dao) {
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
