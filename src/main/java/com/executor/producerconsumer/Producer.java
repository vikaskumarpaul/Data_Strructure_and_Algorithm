package com.executor.producerconsumer;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable
{

	private SynchronousQueue<Integer> queue;
	private ReentrantLock lock;
	private int counter;

	Producer(SynchronousQueue<Integer> queue, ReentrantLock lock, int counter)
	{
		this.queue = queue;
		this.lock = lock;
		this.counter = counter;
	}

	@Override
	public void run()
	{
		try
		{
			lock.lock();

			System.out.println("producer inserting in queue");
			queue.add(counter++);

			System.out.println("producer going to sleep");
			Thread.sleep(1000);

			System.out.println("producer unlocking");
			lock.unlock();

		} catch (Exception e)
		{
			System.out.println("Exception in Producer");
			e.printStackTrace();
		}
	}
}
