package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyCloudLogAspect {

	@Before("forDaoPackageNoSettersOrGetters()")
	public void logToCloud() {
		
		System.out.println("Executing @Before advice on logToCloud()");
		
	}	
	
}
