package com.anonymous;

public class Test1
{
	private static Test1 Test_instance = new Test1();
	
	public Test1()
	{
		System.out.println("Constructor");
	}
	static
	{
		System.out.println("Static initiallizer");
	}
	public static void something()
	{
		System.out.println("something");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main1");
		Test1.something();
		System.out.println("main2");
	}
}
