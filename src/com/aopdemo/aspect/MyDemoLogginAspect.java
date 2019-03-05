package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLogginAspect {
	
	//@BEFORE
	@Before("com.aopdemo.aspect.AopExpressions.forDaoPackageNoSettersOrGetters()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Executing @Before advice on addAccount()");
		
	}
	
	
}
