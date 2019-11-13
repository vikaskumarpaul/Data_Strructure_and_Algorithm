package com.comparator.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CountDownLatchTest2
{
	public static void main(String[] args)
	{
		System.out.println("Main start");
		Executor executor = Executors.newFixedThreadPool(1);
		CountDownLatch latch = new CountDownLatch(5);

		Runnable run1 = () -> {
			System.out.println("Run 1");
			try
			{
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally
			{
				latch.countDown();
			}
		};

		Runnable run2 = () -> {
			System.out.println("Run 2");
			try
			{
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally
			{
				latch.countDown();
			}
		};

		Runnable run3 = () -> {
			System.out.println("Run 3");
			try
			{
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally
			{
				latch.countDown();
			}
		};

		Runnable run4 = () -> {
			System.out.println("Run 4");
			try
			{
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally
			{
				latch.countDown();
			}
		};

		Runnable run5 = () -> {
			System.out.println("Run 5");
			try
			{
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally
			{
				latch.countDown();
			}
		};

		try
		{
			latch.await();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.execute(run1);
		executor.execute(run2);
		executor.execute(run3);
		executor.execute(run4);
		executor.execute(run5);

		System.out.println("Main End");

	}
}
