package com.producerconsumer;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDriver
{
	public static void main(String[] args)
	{
		ReentrantLock lock = new ReentrantLock();
		Condition onEmty = lock.newCondition();
		Condition onFull = lock.newCondition();
		LinkedList<Integer> list = new LinkedList<Integer>();
		ExecutorService service = null;
		try
		{

			Thread t1 = new Thread(new Producer(lock, list, onEmty, onFull));
			Thread t2 = new Thread(new Consumer(lock, list, onEmty, onFull));

			t1.start();
			t2.start();

			t1.join();
			t2.join();

			/*
			 * service = Executors.newFixedThreadPool(2); service.submit(new
			 * Producer(lock, list, onEmty, onFull)); service.submit(new
			 * Producer(lock, list, onEmty, onFull));
			 */

		} catch (Exception e)
		{
			System.out.println("Error in Thread Driver");
		} finally
		{
			service.shutdown();
		}
	}
}
