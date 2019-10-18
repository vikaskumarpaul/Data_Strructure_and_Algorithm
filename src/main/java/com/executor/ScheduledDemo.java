package com.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledDemo
{
	public static void main(String[] args)
	{
		ScheduledExecutorService scheduled = Executors
				.newScheduledThreadPool(10);

		for (int i = 0; i < 10; i++)
		{
			scheduled.scheduleAtFixedRate(new Runnable()
			{

				@Override
				public void run()
				{

					synchronized (this)
					{
						System.out.println("current thread id: "
								+ Thread.currentThread().getId() + " and name: "
								+ Thread.currentThread().getName());
						try
						{
							Thread.currentThread().sleep(1000);
						} catch (InterruptedException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}, 5, 5, TimeUnit.SECONDS);
		}
	}
}
