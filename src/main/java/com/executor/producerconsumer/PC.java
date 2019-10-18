package com.executor.producerconsumer;

import java.util.LinkedList;

public class PC
{
	final LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 2;

	public void produce() throws InterruptedException
	{
		int count = 0;
		while (true)
		{
			synchronized (this)
			{

				while (list.size() == capacity)
				{
					System.out.println("putting producer thread to wait state");
					wait();
				}

				int to_be_added = count++;
				System.out.println(
						"producer thread adding counter: " + to_be_added);

				list.add(to_be_added);

				System.out.println("Producer thread notifying to consumer");

				notify();

				System.out.println("sleeping producer thread");

				Thread.sleep(1000);

			}
		}
	}

	public void consume() throws InterruptedException
	{
		while (true)
		{
			synchronized (this)
			{
				while (list.size() == 0)
				{
					System.out.println("putting consumer thread to wait state");
					wait();
				}

				int to_be_remove = list.poll();
				System.out.println(
						"consumer thread removing counter: " + to_be_remove);

				System.out.println("consumer thread notifying to consumer");

				notify();

				System.out.println("sleeping producer thread");

				Thread.sleep(1000);

			}
		}
	}
}
