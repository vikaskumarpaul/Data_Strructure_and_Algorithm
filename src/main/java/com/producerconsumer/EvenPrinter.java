package com.producerconsumer;

public class EvenPrinter
{
	static boolean even = true;
	public static void main(String[] args)
	{
		int limit = 10;
		Thread evenprinter = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				int evennumber = 2;
				while (evennumber < limit)
				{
					synchronized (this)
					{
						try
						{
							while (!even)
							{
							 	wait();
							}

							System.out.println("Even Number: " + evennumber);

							Thread.sleep(1000);
							even = true;
							evennumber = evennumber + 2;
							notify();
						} catch (InterruptedException e)
						{
							System.out.println("Error occur while printing ");
						}
					}
				}

			}
		});

		Thread oddPrinter = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				int oddNumber = 1;
				while (oddNumber < limit)
				{
					synchronized (this)
					{
						try
						{
							while (even)
							{
								wait();
							}

							System.out.println("Odd Number: " + oddNumber);

							Thread.sleep(1000);
							even = false;
							oddNumber = oddNumber + 2;
							notify();
						} catch (InterruptedException e)
						{
							System.out.println("Error occur while printing ");
						}
					}
				}

			}
		});

		evenprinter.start();
		oddPrinter.start();

		try
		{
			evenprinter.join();
			oddPrinter.join();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
