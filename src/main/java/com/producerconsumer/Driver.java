package com.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver
{
	public static void main(String[] args)
	{
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

		ExecutorService service = Executors.newSingleThreadExecutor();
		service.submit(new ProducerWithQueue(queue));
		service.submit(new ConsumerWithQueue(queue));
		
		service.shutdown();
	}
}
