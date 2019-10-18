package com.comparator.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo
{
	public static void main(String[] args)
	{
		Semaphore sema = new Semaphore(2);
		
		Mythread t1 = new Mythread(sema, "A");
		Mythread t2 = new Mythread(sema, "B");
		
		t1.start();
		t2.start();
		
		System.out.println("Thread Started");
		
		try
		{
			t1.join();
			t2.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
