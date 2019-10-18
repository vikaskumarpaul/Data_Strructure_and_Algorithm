package com.countdown;

import java.util.concurrent.CountDownLatch;

public class Worker2 implements Runnable
{
	
	CountDownLatch latch;
	
	Worker2(CountDownLatch latch)
	{
		this.latch = latch;
	}
	
	@Override
	public void run()
	{
		try
		{
			System.out.println("Runnable with worker 2");
			Thread.sleep(1000);
		} catch (Exception e)
		{
			System.out.println("Exception from Worker2");
		}
		finally
		{
			System.out.println("Worker 2 calling countdown latch");
			latch.countDown();
		}
	}
}
