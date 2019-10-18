package com.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTest
{
	public static void main(String[] args)
	{
		PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>();

		queue.add(34);
		queue.add(12);
		queue.add(78);
		queue.add(23);
		queue.add(99);
		queue.add(22);
		queue.add(11);
		queue.add(8);

		System.out.println(queue);
	}
}
