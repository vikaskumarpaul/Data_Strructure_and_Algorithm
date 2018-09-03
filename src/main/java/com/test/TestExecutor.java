package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

public class TestExecutor
{
	public static void main(String[] args)
	{
		/*ExecutorService service = Executors.newFixedThreadPool(5);
		service.execute(new PrintA());
		try
		{
			Thread.sleep(5000);;
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		service.execute(new PrintB());
		service.execute(new PrintC());
		service.execute(new PrintD());
		service.execute(new PrintE());*/
		
//		ThreadFactory th = new ThreadFactoryBuilder().build();
		
/*		ExecutorService service = Executors.newSingleThreadExecutor();
		int i = 0;
		do
		{
			service.execute(new PrintVikas());
			service.execute(new PrintPaul());
			System.out.println(i);
			++i;
		}
		while(i<100);	
		
		if(!service.isShutdown())
		{
			service.shutdown();
			System.out.println("NOt shutdown!!");
			service.shutdownNow();
		}*/
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Integer> fut1 = service.submit(new CallableTest1());
		Future<Integer> fut2 = service.submit(new CallableTest2());
		service.shutdown();
		int a = 0;
		int b = 0;
		try
		{
			a = fut1.get();
			b = fut2.get();
		}
		catch(Exception ex)
		{
			System.out.println("caught xception");
		}
		System.out.println("callable1: "+ a);
		System.out.println("callable2: "+ b);
		
	}
}
