package com.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class ConsumerWithQueue implements Runnable
{
	private ArrayBlockingQueue<Integer> queue;
	public ConsumerWithQueue(ArrayBlockingQueue<Integer> queue)
	{
		this.queue = queue;
	}

	@Override
	public void run()
	{
		while (true)
		{
			System.out.println("removed from queue: " + queue.poll());
		}

	}
}
