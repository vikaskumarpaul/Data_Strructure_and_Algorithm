package com.multithreading;

public class ThreadTest
{

	public static void main(String[] args) throws InterruptedException
	{

		final PC1 pc = new PC1();
		Thread t1 = new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				try
				{
					pc.comsume();
				} catch (Exception e)
				{
					e.printStackTrace();
				} finally
				{
					System.out.println("Consume Thread: "
							+ Thread.currentThread().getName());
				}

			}
		});

		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				try
				{
					pc.produce();
				} catch (Exception e)
				{
					e.printStackTrace();
				} finally
				{
					System.out.println("Produce Thread: "
							+ Thread.currentThread().getName());
				}

			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
}
