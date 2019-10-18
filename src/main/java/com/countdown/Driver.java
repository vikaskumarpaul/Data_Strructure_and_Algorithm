package com.countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 
 * CountDown latch is used to execute all other thread before it continue to the calling thread i.e. main thread 
 * 
 * 
 * 
 * 
 * @author yogiv
 *
 */
public class Driver
{
	public static void main(String[] args)
	{
		ExecutorService service = null;
		try
		{
			service = Executors.newFixedThreadPool(2);
			CountDownLatch latch = new CountDownLatch(3);

			System.out.println("Latch and service created");

			service.submit(new Worker1(latch));
			service.submit(new Worker2(latch));
			service.submit(new Worker3(latch));

			System.out.println("Services Done and waiting for countdown");

			latch.await();

			System.out.println("Called Await and printing after that");

			after("Hello After");
			
			System.out.println("*****Main execution Completed*****");
		} catch (Exception e)
		{
			System.out.println("Exception in driver");
		} finally
		{
			service.shutdown();
		}
	}

	public static void after(String s1)
	{
		System.out.println("In after......" + s1);
	}
}
