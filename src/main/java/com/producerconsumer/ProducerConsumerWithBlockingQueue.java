package com.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerWithBlockingQueue
{
	public static void main(String[] args)
	{
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
		int size = 5;

		Thread producer = new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				int a = 10;
				while (true)
				{
					try
					{
						System.out.println(
								"Thread " + Thread.currentThread().getName()
										+ " with value: " + a);
						queue.add(a++);

						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						System.out.println("Producer thread has problem: " + e);
						e.printStackTrace();
					}
				}

			}
		}, "produer");

		Thread consumer = new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				while (true)
				{
					try
					{
						System.out.println(
								"Thread " + Thread.currentThread().getName()
										+ "is trying to remove element: "
										+ queue.poll());
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						System.out.println("Consumer thread intrrupted");
					}
				}

			}
		}, "consumer");

		producer.start();
		consumer.start();

		try
		{
			producer.join();
			consumer.join();
		} catch (Exception e)
		{
			System.out.println("Error while joining the thread");
		}

	}
}
