package com.string;

public class TestGarbageCollection
{
	String test;
	
	public TestGarbageCollection(String s1)
	{
		this.test = s1;
	}
	
	public static void main(String[] args)
	{
		TestGarbageCollection t1 = new TestGarbageCollection("Vikas");
		TestGarbageCollection t2 = new TestGarbageCollection("Paul");
		
		t1 = null;
		t2 = null;
		
		System.gc();	
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		// TODO Auto-generated method stub
		System.out.println("GC object: "+ this.test);
	}
}
