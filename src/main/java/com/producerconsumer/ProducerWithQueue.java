package com.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerWithQueue implements Runnable
{
	private ArrayBlockingQueue<Integer> queue;
	public ProducerWithQueue(ArrayBlockingQueue<Integer> queue)
	{
		this.queue = queue;
	}

	@Override
	public void run()
	{
		int a = 0;
		while (true)
		{
			System.out.println("Adding value: "+a);
			queue.add(a++);
		}

	}
}
