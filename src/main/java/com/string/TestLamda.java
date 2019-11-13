package com.string;

import java.util.function.Predicate;

public class TestLamda
{
	public static void main(String[] args)
	{
		Predicate<String> ppa = (String t) -> {
			return t.contains("V");
		};
		
		System.out.println(ppa.test("Vikas"));
	}
}