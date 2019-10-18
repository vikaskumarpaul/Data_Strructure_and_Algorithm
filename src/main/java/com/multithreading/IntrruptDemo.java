package com.multithreading;

public class IntrruptDemo
{
	public static void main(String[] args)
	{
		worker1 w1 = new worker1();

		Thread t1 = new Thread(w1);
		t1.start();
		t1.interrupt();
	}
}

class worker1 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			callsleeptest(i);
		}

	}

	private void callsleeptest(int i)
	{
		System.out.println(i);
		try
		{
			if(!Thread.currentThread().isInterrupted())
			{
				System.out.println("current thread is not intrupped");
				Thread.currentThread().sleep(1000);
				Thread.currentThread().stop();
			}
			else
			{
				System.out.println("Current thread is intrupped");
				Thread.currentThread().sleep(1000);
			}
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
