package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		String msg = obj.getMessage();
		System.out.println(msg);
		
		
		HelloWorld obj2 = new HelloWorld();
		msg = obj2.getMessage();
		System.out.println(msg);
		
	}

}
//1. 静态代理
//2. 