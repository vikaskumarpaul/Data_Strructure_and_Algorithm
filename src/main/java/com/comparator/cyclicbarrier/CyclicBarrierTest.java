package com.comparator.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CyclicBarrierTest
{
	public static void main(String[] args)
	{
		CyclicBarrier barrier = new CyclicBarrier(3);
		Executor executor = Executors.newFixedThreadPool(5);
		executor.execute(new Help3(barrier));
		executor.execute(new Help3(barrier));
		executor.execute(new Help3(barrier));
		
		System.out.println("Sleeping thread....");
		try
		{
			Thread.sleep(1000);
		}catch (Exception e) {
		}
	}
}

class Help3 implements Runnable
{
	CyclicBarrier barrier = null;
	
	public Help3(CyclicBarrier barrier)
	{
		this.barrier = barrier;
	}
	
	
	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				System.out.println("Thread waiting at barrier");
				barrier.await();
				
			} catch (Exception e)
			{
				System.out.println("Caught Exception");
			}
			
		}
		
	}
}
