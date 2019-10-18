package com.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FixedSizepoolDemo
{
	public static void main(String[] args)
	{
		Executor executor = Executors.newFixedThreadPool(10);
		for(int i = 0; i<10; i++)
		{
			executor.execute(new Runnable()
			{
				
				@Override
				public void run()
				{
					System.out.println("Current Thread: "+ Thread.currentThread().getId()+ "    "+ Thread.currentThread().getName());
					
				}
			});
		}
	}
}
