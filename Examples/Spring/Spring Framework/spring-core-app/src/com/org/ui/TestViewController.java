package com.org.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.service.EmployeeServiceImpl;

public class TestViewController {

	public static void main(String[] args) {
		// starts the spring ioc container - ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// how to get the object from the container
		// <bean id = "empService" class = "com.org.service.EmployeeServiceImpl">
		EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("employeeServiceImpl"); 
		service.save(); // save() -> dao.store()
		//closing the context
		ClassPathXmlApplicationContext cpx = (ClassPathXmlApplicationContext)context;
		cpx.close();
	}

}
