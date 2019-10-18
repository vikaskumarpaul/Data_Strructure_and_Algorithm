package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AuditLogAdvice implements InvocationHandler
{

	private Object target;

	AuditLogAdvice(Object target)
	{
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("Creating the audit log....");
		Object result = method.invoke(target, args);
		return null;
	}
}
