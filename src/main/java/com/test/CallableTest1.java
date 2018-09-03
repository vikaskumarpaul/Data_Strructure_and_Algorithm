package com.test;

import java.util.concurrent.Callable;

public class CallableTest1 implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception
	{
		System.out.println("Callable Test1");
		return 10+10+10;
	}
	
}
