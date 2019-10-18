package com.executor.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueTest
{
	public static void main(String[] args)
	{
		SynchronousQueue<Integer> dataQueue = new SynchronousQueue<Integer>();
		
		ArrayBlockingQueue<Integer> ar = new ArrayBlockingQueue<Integer>(1);
		ar.add(1);
		
		System.out.println(ar);
		
		//dataQueue.
		
		System.out.println(dataQueue);
	}
}
