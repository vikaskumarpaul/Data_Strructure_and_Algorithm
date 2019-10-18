package com.anonymous;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test11
{
	public static List<String> findPairs(List<Integer> inputNumbers,
			int sumNumber)
	{
		List<String> result = new LinkedList<String>();
		for (int i = 0; i < inputNumbers.size(); i++)
		{
			for (int y = i + 1; y < inputNumbers.size(); y++)
			{
				if((inputNumbers.get(i)+inputNumbers.get(y))==sumNumber)
				{
					String data = "("+i+","+y+")";
					result.add(data);
				}
			}
		}

		return result;

	}

	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(10, 6, 6, 6, 7, 9);
		System.out.println(findPairs(input, 16));

	}
}
