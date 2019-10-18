package com.defaultTest;

public class TestDrive implements Default3
{
	public static void main(String[] args)
	{
		Default1 d1 = new TestDrive();
		Default2 d2 = new TestDrive();
		Default3 d3 = new TestDrive();
		System.out.println(d1.hello());
		System.out.println(d2.hello());
		System.out.println(d3.hello());
	}
	
	/*
	 * @Override public String hello() { return "Hello from class"; }
	 */

}
