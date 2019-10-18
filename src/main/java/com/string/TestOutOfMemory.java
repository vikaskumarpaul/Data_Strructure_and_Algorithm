package com.string;

public class TestOutOfMemory
{
	public static void main(String[] args)
	{
		System.out.println("Started");
		int[] test = new int[1000000*10000000];
		System.out.println("Ended");
	}
}
