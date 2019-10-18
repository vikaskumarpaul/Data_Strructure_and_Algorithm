package com.Future;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo
{
	private static final ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(
			5);
	private static int counter = 0;

	private static Integer producer()
	{
		queue.add(counter++);
		return counter;
	}
	private static Integer consumer(ArrayBlockingQueue<Integer> queee)
	{
		queee.poll();
		return counter--;
	}

	public static void main(String[] args)
	{
		CompletableFuture.supplyAsync(() -> producer())
						.thenApplyAsync(queueee -> consumer(queue));
		System.out.println("Total queue size: " + queue.size());
	}
}
