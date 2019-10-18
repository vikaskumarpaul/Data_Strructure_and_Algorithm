package com.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CachedDemo
{
	public static void main(String[] args)
	{
		Executor executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++)
		{
			executor.execute(new Runnable()
			{

				@Override
				public void run()
				{
					System.out.println("Current Thread: "
							+ Thread.currentThread().getId());

				}
			});
		}
	}
}
