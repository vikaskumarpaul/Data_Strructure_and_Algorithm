package com.string;

import java.util.function.Predicate;

public class TestLamda
{
	public static void main(String[] args)
	{
		Predicate<String> staa = str -> teststr(str);
		System.out.println(staa.test(null));
	}

	private static boolean teststr(String str)
	{
		if (str == null)
		{
			return false;
		} else
		{
			return true;
		}
	}
}