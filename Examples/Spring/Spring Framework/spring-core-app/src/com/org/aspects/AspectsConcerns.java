package com.org.aspects;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectsConcerns {

	@Before("execution(public void com.org.service.EmployeeServiceImpl.save())")
	public void logDateTimeBefore() {
		System.out.println(LocalDateTime.now());
	}
	@After("execution(public void com.org.service.EmployeeServiceImpl.save())")
	public void logDateTimeAfter() {
		System.out.println(LocalDateTime.now());
	}
}
