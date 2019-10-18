package com.test;

public class StaticOverriding
{

	private String fubction()
	{
		System.out.println("Local Function");
		return null;
	}

	public final static String fubction(int data)
	{
		return String.valueOf(data);
	}

	public static void main(String[] args)
	{
		assert args.length>=0 : "args cannot be null";
		StaticOverriding overriding = new StaticOverriding();
		overriding.fubction();
	}
}
