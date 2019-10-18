package com.executor.producerconsumer;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable
{
	private SynchronousQueue<Integer> queue;
	private ReentrantLock lock;

	Consumer(SynchronousQueue<Integer> queue, ReentrantLock lock)
	{
		this.queue = queue;
		this.lock = lock;
	}

	@Override
	public void run()
	{
		try
		{
			lock.lock();

			int data = queue.poll();
			System.out.println("consumer removing in queue: " + data);

			System.out.println("consumer going to sleep");
			Thread.sleep(1000);
			
			System.out.println("consumer unlocking");
			lock.unlock();


		} catch (Exception e)
		{
			System.out.println("Exception in Consumer");
			e.printStackTrace();
		}
	}
}
