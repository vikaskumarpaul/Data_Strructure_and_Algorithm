package com.executor.producerconsumer;

public class Workers
{

	public static void main(String[] args)
	{
		final PC pc = new PC();
		Thread t1 = new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				try
				{
					pc.produce();
				} catch (Exception e)
				{
					System.out.println("cause exception while produce");
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
					pc.consume();
				} catch (Exception e)
				{
					System.out.println("cause exception while produce");
				}

			}
		});

		t1.start();
		t2.start();

		try
		{
			t1.join();
			t2.join();
		} catch (Exception e)
		{
			System.out.println("Exception while joining the threads");
		}
	}
}
