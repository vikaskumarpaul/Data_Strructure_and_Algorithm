package com.anonymous;

public class Test14
{
	
	public static int i = 0;
	
	public static void print(int i)
	{
		System.out.println(i);
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		print(i++);
	}
}
