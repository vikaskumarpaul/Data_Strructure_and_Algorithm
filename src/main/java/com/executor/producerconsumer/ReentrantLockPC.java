package com.executor.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockPC
{
	int size;
	SynchronousQueue<Integer> queue;
	private ReentrantLock lock;
	private Condition notfull;
	private Condition notempty;

	int max = 10;

	public ReentrantLockPC(int size)
	{
		this.size = size;
		queue = new SynchronousQueue<>();
		lock = new ReentrantLock(true);
		notfull = lock.newCondition();
		notempty = lock.newCondition();
	}

	public void produce() throws InterruptedException
	{
		for(int i = 1; i<max; i++)
		{
			try
			{
				lock.lock();

				while (queue.size() == size)
				{
					notfull.await();
				}
				queue.add(size++);
				System.out.println("producer added value in queue: " + size
						+ " and now notifying the consumer");
				notempty.signal();
				System.out.println("Produce going to sleep");
				Thread.sleep(1000);
			} catch (Exception e)
			{
				System.out.println("producer got error");
				e.printStackTrace();
			} finally
			{
				lock.unlock();
			}
		}

	}

	public void consume() throws InterruptedException
	{
		for (int i = 1; i<max; i++)
		{
			try
			{
				lock.lock();

				while (queue.size() == 0)
				{
					System.out.println("Consume Waiting");
					notempty.await();
				}

				int dadatopoll = queue.poll();
				System.out.println(
						"Data to be poll: " + dadatopoll + "invoking notify");

				notfull.signal();

				System.out.println("consume going to sleep");
				Thread.sleep(1000);
			} catch (Exception e)
			{
				System.out.println("Error while consume");
				e.printStackTrace();
			} finally
			{
				lock.unlock();
			}
		}
	}
}
