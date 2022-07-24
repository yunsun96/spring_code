package com.sunyun.springtest.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SunyunHandle implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("toString")){
			System.out.println("拦截tostring方法");
		}

		return null;
	}
}
