package com.producerconsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddPrinter implements Runnable
{
	private ReentrantLock lock;
	private Condition onEven;
	private Condition onOdd;
	private int limit;
	boolean evenPrinted;
	
	public OddPrinter(ReentrantLock lock, Condition onEven, Condition onOdd, int limit, boolean evenPrinted)
	{
		super();
		this.lock = lock;
		this.onEven = onEven;
		this.onOdd = onOdd;
		this.limit = limit;
	}

	@Override
	public void run()
	{
		int odd = 1;
		while(odd<limit)
		{
			try
			{
				while(!evenPrinted)
				{
					try
					{
						onOdd.await();
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				lock.lock();
				System.out.println("odd Number: "+odd);
				odd  =  odd+2;
				evenPrinted = false;
				onEven.signal();
			}
			finally
			{
				lock.unlock();
			}
		}
	}
}
