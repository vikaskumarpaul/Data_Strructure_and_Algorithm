package com.string;

import org.apache.commons.math3.util.Pair;

public class TestPair
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;

		Pair<Integer, Integer> p = calculatePair(a, b);

		System.out.println(p.getKey() + " : " + p.getValue());
	}

	private static Pair<Integer, Integer> calculatePair(int a, int b)
	{
		int addresult = a + b;
		int subresult = b - a;

		return Pair.create(addresult, subresult);
	}
}
