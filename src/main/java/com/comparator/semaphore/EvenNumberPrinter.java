package com.comparator.semaphore;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class EvenNumberPrinter implements Runnable
{
	ReentrantLock lock;
	Condition evengenerator;
	Condition oddgenerator;

	public EvenNumberPrinter(ReentrantLock lock, Condition evengenerator, Condition oddgenerator)
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
			if((Shared2.a) % 2 == 1)
			{
				evengenerator.await();
			}
			
			System.out.println("Odd Number: " + ( Shared2.a++));
			
			oddgenerator.signal();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			lock.unlock();
		}
	}
}
