package com.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class singlethreadDemo
{
	public static void main(String[] args)
	{
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(new Runnable()
		{

			@Override
			public void run()
			{
				for (int i = 0; i < 20; i++)
				{
					try
					{
						System.out.println("current thread Id: "
								+ Thread.currentThread().getId()
								+ " Current thread name: "
								+ Thread.currentThread().getName());
						
						Thread.currentThread().sleep(1000);
					}

					catch (Exception e)
					{
						e.printStackTrace();
					}
				}

			}
		});
	}
}
