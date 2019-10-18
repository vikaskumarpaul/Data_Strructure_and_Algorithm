package com.comparator.semaphore;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddNumberPrinter implements Runnable
{
	ReentrantLock lock;
	Condition evengenerator;
	Condition oddgenerator;

	public OddNumberPrinter(ReentrantLock lock, Condition evengenerator, Condition oddgenerator)
	{
		this.lock = lock;
		this.evengenerator = evengenerator;
		this.oddgenerator = oddgenerator;
	}

	@Override
	public void run()
	{
		try
		{
			lock.lock();
			if(Shared2.a %2==0)
			{
				
			}
			System.out.println("Odd Number: " + Shared2.a++);
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			lock.unlock();
		}
	}
}
