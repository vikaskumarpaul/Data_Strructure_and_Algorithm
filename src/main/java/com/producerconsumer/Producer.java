package com.producerconsumer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable
{

	ReentrantLock lock;
	LinkedList<Integer> list;
	Condition onEmpty;
	Condition onFull;
	final int capacity;

	Producer(ReentrantLock lock, LinkedList<Integer> list, Condition onEmpty,
			Condition onFull)
	{
		this.lock = lock;
		this.list = list;
		this.onEmpty = onEmpty;
		this.onFull = onFull;
		this.capacity = 10;
	}

	@Override
	public void run()
	{
		int a = 0;
		int count = 0;
		while (count < 10)
		{
			try
			{
				System.out.println("Producer trying to accure lock");
				lock.lock();
				System.out.println("Producer got lock");

				if (list.size() > capacity)
				{
					System.out.println("producer is full putting to wait");
					onFull.await();
				}

				list.add(a++);
				System.out
						.println("Producer Produced with size: " + list.size());

				System.out.println("Waking up Consumer......");
				onEmpty.signal();
				Thread.sleep(1000);

			} catch (Exception e)
			{
				System.out.println("Exception occur on producer class");
			} finally
			{
				lock.unlock();
			}
			count++;
		}
	}
}
