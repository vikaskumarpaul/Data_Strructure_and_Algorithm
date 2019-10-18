package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletebleFutureDemo
{
	public static void main(String[] args)
	{
		System.out.println("starting main execution");

		ExecutorService executor = Executors.newSingleThreadExecutor();

//		Future<Integer> future = executor.submit(new Hello1());
		CompletableFuture<Integer> future = Executors.submit(new Hello1());
		try
		{
			System.out.println("Main Method output: " + (Integer) future.get());
		} catch (Exception e)
		{
			System.out.println("caught exception....");
		}
	}
}

class Hello1 implements Callable<Integer>
{
	@Override
	public Integer call() throws Exception
	{

		int x = 0;
		while (true)
		{
			System.out.println(x++);
			Thread.currentThread().sleep(1000);
			if (x == 10)
			{
				return x;
			}
		}
	}

}
