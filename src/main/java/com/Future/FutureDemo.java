package com.Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureDemo
{
	private static int task()
	{
		int counter = 0;
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);

			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			counter++;
		}

		return counter;
	}

	public static void main(String[] args)
			throws InterruptedException, ExecutionException
	{
		ExecutorService executor = Executors.newFixedThreadPool(1);

		Future<Integer> fut = executor.submit(() -> task());

		
		try
		{
			System.out.println("time with milli seconds: "
					+ fut.get(5000, TimeUnit.MILLISECONDS));
			System.out.println("is Done: " + fut.isDone());
			if(fut.isDone())
			{
				System.out.println("Cancelling");
				fut.cancel(true);
			}
		} catch (TimeoutException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Final: " + (Integer) fut.get());

		executor.shutdown();
	}
}
