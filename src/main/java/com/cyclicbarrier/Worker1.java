package com.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Worker1 implements Runnable
{
	
	CyclicBarrier barrier;
	
	public Worker1(CyclicBarrier barrier)
	{
		this.barrier = barrier;
	}
	
	@Override
	public void run()
	{
		System.out.println("Worker1");
		try
		{
			barrier.await();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
