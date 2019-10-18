package com.comparator.semaphore;

import java.util.concurrent.Semaphore;

public class EvenOddWithSemaphore
{
	static int data = 1;
	public static void main(String[] args)
	{

		Semaphore value = new Semaphore(2);

		Runnable torun = () -> {
			if (Thread.currentThread().getName().equalsIgnoreCase("even")
					&& (data % 2 == 0))
			{
				int count = 0;
				while (count < 1)
				{

					while (count == 1)
					{
						try
						{
							Thread.currentThread().wait();
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}

					try
					{
						value.acquire();
						System.out.println("Printing Even: " + data++);
						Thread.sleep(1000);

					} catch (Exception e)
					{
						System.out.println("Error while printing ");
					} finally
					{
						value.release();
					}

					++count;
					Thread.currentThread().notifyAll();
				}
			} else
			{
				int count = 0;
				while (count < 1)
				{

					while (count == 1)
					{
						try
						{
							Thread.currentThread().wait();
						} catch (InterruptedException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					try
					{
						value.acquire();
						System.out.println("Printing Odd: " + data++);
						Thread.sleep(1000);
					} catch (Exception e)
					{
						System.out.println("Error while printing ");
					} finally
					{
						value.release();
					}
					++count;
					Thread.currentThread().notifyAll();
				}
			}
		};

		Thread even = new Thread(torun, "even");
		Thread odd = new Thread(torun, "odd");

		even.start();
		odd.start();

		try
		{
			even.join();
			odd.join();
		} catch (Exception e)
		{
			System.out.println("Exception while running" + e);
		}
	}

}
