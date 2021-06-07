package com.skc.aop.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.skc.aop.anno.MyTx;

@Component
public class EmployeeDao {
	
	@MyTx
	public void saveEmployee() {
		System.out.println("FROM SAVE EMPLOYEE");

		/*
		 * if (new Random().nextInt(15) <= 10) { throw new RuntimeException("Dummy"); }
		 */
		
	}

	public void getAllEmployee() {
		System.out.println("FROM ALL EMPLOYEE");
	}
}
