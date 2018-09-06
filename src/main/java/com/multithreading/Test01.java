package com.multithreading;

import java.util.LinkedList;

public class Test01 
{
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 5;
	
	public void produce() throws InterruptedException
	{
		int abc = 0;
		while (true) 
		{
			synchronized (this) 
			{
				if(list.size()==capacity)
				{
					wait();
				}
				
				System.out.println("Producer: "+ abc);
				list.add(abc++);

				notify();
				
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
				if(list.size()==0)
				{
					wait();
				}
				
				System.out.println("consumer: "+ list.removeFirst());
				
				notify();
				
				Thread.sleep(1000);
			}
		}
	}
}
