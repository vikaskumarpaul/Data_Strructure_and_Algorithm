package com.multithreading;

import java.util.LinkedList;
import java.util.List;

public class PC 
{
	private LinkedList<Integer> listcache = (LinkedList<Integer>)Process.getList();
	int capacity = 5;
	
	public void produce() throws InterruptedException
	{
		int value = 0;
		while (true) 
		{
			synchronized (this) 
			{
				if(listcache.size()==capacity)
				{
					wait();
				}
				
				System.out.println("Producer value "+ value);
				listcache.add(value++);
				
				notify();
				
				//Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException
	{
		while (true) 
		{
			synchronized (this) 
			{
				if(listcache.size()==0)
				{
					wait();
				}
				
				System.out.println("Consumer value "+ listcache.removeFirst());
				
				notify();
				
				//Thread.sleep(1000);
			}
		}
	}
}
