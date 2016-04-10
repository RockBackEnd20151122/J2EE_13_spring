package com.veryProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class LogProxy implements InvocationHandler {
	
	private Object object;
	
	public Object bind(Object object ){
		this.object = object;
		return Proxy.newProxyInstance(this.object.getClass().getClassLoader(), this.object.getClass().getInterfaces(), this);
	}
	
	@Override
	//EJB, 分布式
	public Object invoke(Object proxy, Method method, Object[] argus) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("before function excuted:" + argus );
		Object result = method.invoke(this.object, argus);
		System.out.println("after, log/duty/verification"+ result );
		
		return result;
	}


	public Object getObject() {
		return object;
	}


	public void setObject(Object object) {
		this.object = object;
	}
	
}
