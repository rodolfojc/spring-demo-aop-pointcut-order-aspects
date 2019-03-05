package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyApiAnalyticsAspect {

	
	@Before("forDaoPackageNoSettersOrGetters()")
	public void performApiAnalytics() {
		
		System.out.println("Executing @Before advice on performApiAnalytics()");
		
	}
	
	
}
