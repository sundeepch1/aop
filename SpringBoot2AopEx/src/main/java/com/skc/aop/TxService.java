package com.skc.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TxService {
	
	//@Before("")
	//@After("")
	//@Around("")
	//@AfterReturning("")
	//@AfterThrowing("")
	@Before("p1()") // Joinpoint
	public void beginTx() {
		//....
	}
	
	
}
