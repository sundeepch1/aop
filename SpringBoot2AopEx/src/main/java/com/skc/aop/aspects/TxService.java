package com.skc.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {

	/*
	 * @Pointcut("execution(public void com.skc.aop.dao.EmployeeDao.saveEmployee())"
	 * ) public void p1() {}
	 * 
	 * @Before("p1()") //Join Point public void beginTx() {
	 * System.out.println("Tx started..."); }
	 * 
	 * @After("p1()") //Join Point public void commitTx() {
	 * System.out.println("Tx commited..."); }
	 */

	/*
	 * @Pointcut("execution(public String com.skc.aop.dao.EmployeeDao.saveEmployee())"
	 * ) public void p1() { System.out.println("Pointcut"); }
	 */
	
	@Pointcut("@annotation(com.skc.aop.anno.MyTx)")
	public void p1() {
		System.out.println("Pointcut");
	}

	@Pointcut("execution(public String com.skc.aop.dao.EmployeeDao.updateEmployee())")
	public void p2() {

	}
	
	  @Around("p1()") public void aroundTest(ProceedingJoinPoint jp) {
	  System.out.println("Before b.method()"); try { Object obj =
	  jp.proceed();//cal business method System.out.println(obj); //on success }
	  catch (Throwable e) { // on failure e.printStackTrace(); } //at any case
	  System.out.println("After b.method"); }
	 


	 @Before("p1()") // joinpoint 
	 public void before() {
		 System.out.println("Tx Started!!"); 
	 }

	 /* 
	 * @AfterReturning(value = "p1()", returning = "ob") public void commitTx() {
	 * System.out.println("Tx is commited"); }
	 * 
	 * @AfterThrowing(value = "p1()", throwing = "th") public void
	 * rollbackTx(Throwable th) { System.out.println("Tx is rollback. " +
	 * th.getMessage()); }
	 * 
	 * 
	 * @After("p1()") public void sendReport() {
	 * System.out.println("Report send !!"); }
	 */
	 

}
