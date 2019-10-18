package com.comparator.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2
{
	public static void main(String[] args)
	{
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(new Reader1("Vikas"));
		service.submit(new Reader2("Paul"));
		
		service.shutdown();
	}
}
