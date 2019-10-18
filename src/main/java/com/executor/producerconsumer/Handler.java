package com.executor.producerconsumer;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Handler
{
	public static void main(String[] args) throws InterruptedException 
	{
		ReentrantLock lock = new ReentrantLock(true);
		SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>(true);
		int counter = 0;
		
		final Producer producer = new Producer(queue, lock, counter);
		final Consumer consumer = new Consumer(queue, lock);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}
}
