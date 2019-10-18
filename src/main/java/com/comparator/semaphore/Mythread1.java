package com.comparator.semaphore;

import java.util.concurrent.Semaphore;

public class Mythread1 extends Thread
{
	Semaphore sema;
	String s1;

	public Mythread1(Semaphore sema, String s1)
	{
		this.sema = sema;
		this.s1 = s1;
	}

	@Override
	public void run()
	{
		if (this.s1.equals("A"))
		{
			System.out.println("came for A thread");
			try
			{
				System.out.println("Thread A tryinh to accure the lock");
				this.sema.acquire();
				System.out.println("Thread A got the lock");
				for (int i = 0; i < 5; i++)
				{
					Shared1.count++;
					System.out.println("Thread A Count: " + Shared1.count);
				}
				System.out.println("Thread A releasing permit");
				this.sema.release();
				System.out.println("Thread A permit released");
			} catch (Exception e)
			{
				System.out.println("Exception occur for A");
			}
		} else
		{
			System.out.println("came for B thread");

			try
			{
				System.out.println("Thread B tryinh to accure the lock");
				this.sema.acquire();
				System.out.println("Thread B got the lock");

				for (int i = 0; i < 5; i++)
				{
					Shared1.count--;
					System.out.println("Thread B Count: " + Shared1.count);
				}
				System.out.println("Thread B releasing permit");
				this.sema.release();
				System.out.println("Thread B permit released");
			} catch (Exception e)
			{
				System.out.println("Exception occur for thread B");
			}
		}
	}
}
