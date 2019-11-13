package com.deadlock;

public class Shared
{
	synchronized void test1(Shared s1)
	{
		System.out.println("Test1 begin...");
		
		Util.sleep();
		s1.test2(this);
		
		System.out.println("Test1 End...");
	}
	synchronized void test2(Shared s2)
	{
		System.out.println("Test1 begin...");
		
		Util.sleep();
		s2.test1(this);
		
		System.out.println("Test1 End...");
	}
	
	public static void main(String[] args)
	{
		synchronized
		{
			
		}
	}
}
