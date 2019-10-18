package com.producerconsumer;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOddDriver
{
	public static void main(String[] args)
	{
		ReentrantLock lock = new ReentrantLock();
		Condition onEven = lock.newCondition();
		Condition onOdd = lock.newCondition();
		int limit = 10;
		boolean evenprinter = true;
		Executor executor = Executors.newSingleThreadExecutor();
		
		executor.execute(new EvenPrinter(lock, onEven, onOdd, limit, evenprinter));
		executor.execute(new OddPrinter(lock, onEven, onOdd, limit, evenprinter));
		
	}
}
