package com.test;

import java.util.TreeSet;

public class TreeTest
{
	public static void main(String[] args)
	{
		TreeSet<Integer> treeset = new TreeSet<>();
		
		treeset.add(50);
		treeset.add(20);
		treeset.add(80);
		treeset.add(10);
		treeset.add(90);
		
		for(Integer a:treeset)
		{
			System.out.println(a);
		}
	}
}
