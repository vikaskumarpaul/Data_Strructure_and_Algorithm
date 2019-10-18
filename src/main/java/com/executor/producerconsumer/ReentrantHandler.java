package com.executor.producerconsumer;

public class ReentrantHandler
{
	public static void main(String[] args) throws InterruptedException
	{
		ReentrantLockPC pc = new ReentrantLockPC(5);

		Runnable r1 = () -> {
			try
			{
				pc.produce();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		Runnable r2 = () -> {
			try
			{
				pc.consume();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
}
