package com.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo
{
	public static void main(String[] args)
	{
		CustomerBussinessService bs = new CustomerBussinessService();

		// bs.saveCustomer();

		ClassLoader cl = DynamicProxyDemo.class.getClassLoader();

		AuditLogAdvice advice = new AuditLogAdvice(bs);

		CustomerService proxiedService = (CustomerService) Proxy
				.newProxyInstance(cl, new Class[]
				{CustomerService.class}, advice);

		proxiedService.saveCustomer();

	}
}
