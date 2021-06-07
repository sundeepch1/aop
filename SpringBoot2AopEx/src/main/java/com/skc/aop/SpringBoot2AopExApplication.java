package com.skc.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBoot2AopExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2AopExApplication.class, args);
	}

}
