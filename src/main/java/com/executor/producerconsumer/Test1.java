package com.executor.producerconsumer;

import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test1
{
	public static void main(String[] args)
	{
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(100);

		final Runnable producer = () -> {
			while (true)
			{
				try
				{
					String s1 = UUID.randomUUID().toString();
					System.out.println("String to be added: " + s1);
					queue.put(s1);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		
		new Thread(producer).start();
		new Thread(producer).start();

		final Runnable consumer = () -> {
			while (true)
			{
				String s1 = queue.poll();
				System.out.println("String removed from queue: " + s1);
			}
		};
		
		new Thread(consumer).start();
		new Thread(consumer).start();
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
