package com.countdown;

import java.util.concurrent.CountDownLatch;

public class Worker1 implements Runnable
{
	CountDownLatch latch;
	
	Worker1(CountDownLatch latch)
	{
		this.latch = latch;
	}
	
	@Override
	public void run()
	{
		try
		{
			System.out.println("Runnable with worker 1");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println("Exception from Worker1");
		}
		finally
		{
			System.out.println("Worker 1 calling countdown latch");
			latch.countDown();
		}
	}
}
