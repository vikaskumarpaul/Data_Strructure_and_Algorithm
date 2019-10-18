package com.comparator.forkjoinpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFork
{
	public static void main(String[] args)
			throws InterruptedException, ExecutionException
	{
		ExecutorService forkpool = Executors.newFixedThreadPool(6);

		Callable<Integer> f1 = () -> {

			System.out.println("f1 wake up");
			Thread.currentThread().sleep(1000);
			return 100;
		};
		Callable<Integer> f2 = () -> {
			Thread.currentThread().sleep(3000);
			System.out.println("f2 wake up");
			return 100;
		};
		Callable<Integer> f3 = () -> {
			System.out.println("f3 wake up");
			Thread.currentThread().sleep(5000);
			return 100;
		};
		Callable<Integer> f4 = () -> {
			System.out.println("f4 wake up");
			Thread.currentThread().sleep(7000);
			return 100;
		};
		Callable<Integer> f5 = () -> {
			System.out.println("f5 wake up");
			Thread.currentThread().sleep(9000);
			return 100;
		};
		Callable<Integer> f6 = () -> {

			System.out.println("f6 wake up");
			Thread.currentThread().sleep(10000);
			return 100;
		};

		Future<Integer> c1 = forkpool.submit(f1);
		Future<Integer> c2 = forkpool.submit(f2);
		Future<Integer> c3 = forkpool.submit(f3);
		Future<Integer> c4 = forkpool.submit(f4);
		Future<Integer> c5 = forkpool.submit(f5);
		Future<Integer> c6 = forkpool.submit(f6);
		
		forkpool.shutdown();

		System.out.println(c1.get() + c2.get() + c3.get() + c4.get() + c5.get()
				+ c6.get());
	}
}
