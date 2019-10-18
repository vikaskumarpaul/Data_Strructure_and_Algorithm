package com.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo
{
	public static void main(String[] args)
	{
		ExecutorService service = Executors.newFixedThreadPool(3);

		CyclicBarrier barrier = new CyclicBarrier(3);

		service.submit(new Worker1(barrier));
		service.submit(new Worker2(barrier));
		service.submit(new Worker3(barrier));
		
		System.out.println("######Main Thread#######");
		
		service.shutdown();

	}
}
