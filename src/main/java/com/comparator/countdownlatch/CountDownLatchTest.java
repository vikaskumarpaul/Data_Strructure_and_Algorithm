package com.comparator.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CountDownLatchTest
{
	public static void main(String[] args)
	{
		Executor executor = Executors.newFixedThreadPool(10);
		
		CountDownLatch latch = new CountDownLatch(5);
		executor.execute(new Helper2(latch));
		executor.execute(new Helper2(latch));
		executor.execute(new Helper2(latch));
		executor.execute(new Helper2(latch));
		executor.execute(new Helper2(latch));
		
		try
		{
			System.out.println("keeping latch awaited...");
			latch.await();
			System.out.println("Current thread state: "+Thread.currentThread().getState().name());
		}
		catch (Exception e) 
		{
			System.out.println("caught exception");
		}
		
		System.out.println("Main Thread");
	}
}
class Helper2 implements Runnable
{
	
	CountDownLatch latch = null;
	
	public Helper2(CountDownLatch latch)
	{
		this.latch = latch;
	}
	
	@Override
	public void run()
	{
		
		latch.countDown();
		System.out.println("Decrementing countdown of awaiting latch count: "+ latch.getCount()+" thread Name: "+ Thread.currentThread().getName());
		
	}
}
