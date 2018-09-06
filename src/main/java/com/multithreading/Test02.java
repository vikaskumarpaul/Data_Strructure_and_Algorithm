package com.multithreading;

public class Test02 
{
	public static void main(String[] args) throws InterruptedException
	{
		Test01 t01 = new Test01();
		
		Thread t1 = new Thread(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				try 
				{
					t01.produce();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				try 
				{
					t01.consume();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}
