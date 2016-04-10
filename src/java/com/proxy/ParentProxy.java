package com.proxy;

public class ParentProxy implements Parent {
	
	private Parent parent;

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("before , loggin, dute, verification.");
		this.parent.sayHello();
		System.out.println("after , loggin, dute, verification.");
	}

	@Override
	public void sayByeBye() {
		// TODO Auto-generated method stub
		System.out.println("before , loggin, dute, verification.");
		this.parent.sayByeBye();
		System.out.println("after , loggin, dute, verification.");
	}

	@Override
	public void sayNothing() {
		// TODO Auto-generated method stub
		System.out.println("before , loggin, dute, verification.");
		this.parent.sayNothing();
		System.out.println("after , loggin, dute, verification.");
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	

}
