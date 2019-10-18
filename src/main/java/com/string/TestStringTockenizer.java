package com.string;

import java.util.StringTokenizer;

public class TestStringTockenizer
{
	public static void main(String[] args)
	{
		String s1 = "Hello how are you all";
		StringTokenizer token = new StringTokenizer(s1, " ", true);
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
	}
}
