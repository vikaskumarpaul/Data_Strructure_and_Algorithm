package com.reentrant;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo
{
	//private static final ReentrantLock lock = new ReentrantLock(true);
	private static final ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(
			10);
	private static int counter = 0;
	private static void adding()
	{

		try
		{
			String currString = Thread.currentThread().getName();
			System.out.println("Thread accured: " + currString);
			//lock.lock();
			while (counter < 10)
			{
				queue.add(counter++);
			}
			System.out.println("queue size: " + queue.size());
		} finally
		{
			//lock.unlock();
		}
	}

	private static void checking()
	{
		try
		{
			//lock.lock();
			while (counter != 0)
			{
				int removing = queue.poll();
				System.out.println("removed element from queue: " + removing);
				counter--;
			}
		} finally
		{
			//lock.unlock();
		}
	}

	public static void main(String[] args)
	{

		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.execute(() -> adding());
		executor.execute(() -> checking());
		System.out.println("Shutting Down: "+executor.shutdownNow());
	}
}
