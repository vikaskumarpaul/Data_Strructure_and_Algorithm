package com.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo
{
	public static void main(String[] args)
	{
		Worker1 w1 = new Worker1();
		Worker2 w2 = new Worker2();

		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(2);
		queue.add(w1);
		queue.add(w2);

		RejectedExecutionHandler defaultHandler = new AbortPolicy();

		ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1000,
				TimeUnit.MILLISECONDS, queue, Executors.defaultThreadFactory(),
				defaultHandler);

		for (int i = 0; i < 10; i++)
		{
			executor.execute(new Runnable()
			{

				@Override
				public void run()
				{
					// System.out.println("Hello Runnable");

				}
			});
			/*
			 * System.out.println("Is shutDown1: "+ executor.isShutdown()
			 * +"    is terminated2: "+executor.isTerminated() );
			 * System.out.println("ShutDown now initiated: "+
			 * executor.shutdownNow());
			 * System.out.println("is terminating: "+executor.isTerminating());
			 * System.out.println("Is shutDown2: "+ executor.isShutdown()
			 * +"    is terminated2: "+executor.isTerminated() );
			 */
		}

	}
}

class Worker1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("vikas");
		try
		{
			wait(1000);
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Thread sleeping1");
			}
			

		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Worker2 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("paul");
		try
		{
			wait(1000);
			for (int i = 0; i < 10; i++)
			{
				//Thread.currentThread().sleep(1000);
				System.out.println("Thread sleeping2");
			}
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
