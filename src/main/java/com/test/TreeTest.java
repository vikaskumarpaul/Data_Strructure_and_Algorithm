package com.test;

import java.util.TreeSet;

public class TreeTest
{
	public static void main(String[] args)
	{
		TreeSet<String> treeset = new TreeSet<String>();

		treeset.add("vikas");
		treeset.add("pal");
		treeset.add("hello");
		treeset.add("java");
		treeset.add("killer");

		for (String a : treeset)
		{
			System.out.println(a);
		}
	}
}
