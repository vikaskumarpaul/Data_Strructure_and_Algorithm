package com.producerconsumer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable
{
	ReentrantLock lock;
	LinkedList<Integer> list;
	Condition onEmpty;
	Condition onFull;

	Consumer(ReentrantLock lock, LinkedList<Integer> list, Condition onEmpty,
			Condition onFull)
	{
		this.lock = lock;
		this.list = list;
		this.onEmpty = onEmpty;
		this.onFull = onFull;
	}

	@Override
	public void run()
	{
		int count = 0;
		while (count<10)
		{
			try
			{
				System.out.println("Consumer trying to accure lock");
				lock.lock();
				System.out.println("Consumer got lock");

				if (list.size() <= 0)
				{
					System.out.println("Concumer is empty putting to wait");
					onEmpty.await();
				}

				int remove = list.poll();
				System.out.println("Element removed: " + remove);
				System.out
						.println("Consumer consumed with size: " + list.size());

				System.out.println("Waking up producer......");
				onFull.signal();
				Thread.sleep(1000);

			} catch (Exception e)
			{
				System.out.println("Exception occur on Consumer class");
			} finally
			{
				lock.unlock();
			}
			count++;
		}
	}
}
