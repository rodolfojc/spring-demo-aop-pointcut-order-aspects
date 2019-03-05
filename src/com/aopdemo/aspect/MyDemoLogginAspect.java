package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {
	
	//RELATED ADVICES FOR LOGGING
	
	//@POINCUT DECLARATION
	@Pointcut("execution(* com.aopdemo.dao.*.*(..))")
	public void forDaoPackageDecl() {}
	
	//CREATE POINCUT FOR SETTER
	@Pointcut("execution(* com.aopdemo.dao.*.set*(..))")
	public void forSetter() {}
	
	//CREATE POINTCUT FOR GETTER
	@Pointcut("execution(* com.aopdemo.dao.*.get*(..))")
	public void forGetter() {}
	
	//CREATE POINTCUT EXCLUDE
	@Pointcut("forDaoPackageDecl() && !(forSetter() || forGetter())")
	public void forDaoPackageNoSettersOrGetters() {}
	
	//@BEFORE
	@Before("forDaoPackageNoSettersOrGetters()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Executing @Before advice on addAccount()");
		
	}
	
	@Before("forDaoPackageNoSettersOrGetters()")
	public void performApiAnalytics() {
		
		System.out.println("Executing @Before advice on performApiAnalytics()");
		
	}
	
	
	
}
