package com.comparator.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo1
{
	public static void main(String[] args)
	{
		
		Semaphore s1 = new Semaphore(5);
		
		Mythread1 t1 = new Mythread1(s1, "A");
		Mythread1 t2 = new Mythread1(s1, "B");
		
		try
		{
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
		}
		catch (Exception e) {
			System.out.println("Error");
		}
	}
}
