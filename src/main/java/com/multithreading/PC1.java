package com.multithreading;

import java.util.LinkedList;

public class PC1
{

	public LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 2;

	public void comsume() throws InterruptedException
	{
		while (true)
		{
			synchronized (this)
			{
				while(list.size()==0)
					wait();
				
				int removed = list.removeFirst();
				System.out.println("consumer consumed-" + removed);

				// to insert the jobs in the list
				notify();
				
				Thread.sleep(1000);
			}
		}

	}

	public void produce() throws InterruptedException
	{

		int value = 0;
		while (true)
		{
			synchronized (this)
			{

				while (list.size() == 1)
					wait();

				System.out.println("Producer produced-" + value);

				// to insert the jobs in the list
				list.add(value++);

				// notifies the consumer thread that
				// now it can start consuming
				notify();

				// makes the working of program easier
				// to understand
				Thread.sleep(1000);
			}
		}
	}
}
