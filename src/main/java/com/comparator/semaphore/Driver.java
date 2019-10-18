package com.comparator.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Driver
{
	public static void main(String[] args)
	{
		ReentrantLock lock = new ReentrantLock();
		Condition evenlock  = lock.newCondition();
		Condition oddlock  = lock.newCondition();

		EvenNumberPrinter evenPrinter = new EvenNumberPrinter(lock, evenlock, oddlock);
		OddNumberPrinter oddPrinter = new OddNumberPrinter(lock, evenlock, oddlock);

		ExecutorService service = Executors.newFixedThreadPool(2);

		service.submit(evenPrinter);
		service.submit(oddPrinter);

		service.shutdown();
	}
}
