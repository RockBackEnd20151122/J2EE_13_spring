package com.veryProxy;

import com.proxy.Child;
import com.proxy.Parent;

public class TestForVeryProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogProxy proxy = new LogProxy();
		Child c = new Child();
		Parent p = (Parent) proxy.bind(c);
		
		c.sayHello();
		System.out.println(">>>>>>>>>>>>>>>");
		p.sayHello();
		
	}

}
