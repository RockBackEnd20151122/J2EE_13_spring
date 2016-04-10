package com.proxy;

public class TestForProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentProxy parentProxy = new ParentProxy();
		Child c = new Child();
		parentProxy.setParent(c);
		
		parentProxy.sayHello();
		parentProxy.sayByeBye();
		parentProxy.sayNothing();

	}

}