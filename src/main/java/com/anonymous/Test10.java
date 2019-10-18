package com.anonymous;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test10
{
	public static List<String> groupAnagrams(List<String> inputList)
	{
		List<String> result = new LinkedList<String>();

		for (int i = 0; i < inputList.size(); i++)
		{
			for (int y = i + 1; y < inputList.size(); y++)
			{
				if ((inputList.get(i).length()) == (inputList.get(y).length()))
				{
					StringBuilder build = new StringBuilder(inputList.get(y))
							.reverse();
					if (inputList.get(i).equalsIgnoreCase(build.toString())
							&& !(result.contains(inputList.get(i))))
					{
						result.add(inputList.get(i));
						result.add(inputList.get(y));
						break;
					} else
					{
						result.add(inputList.get(y));
						break;
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args)
	{
		List<String> input = Arrays.asList("cat", "tac", "amen", "mena", "dog");
		System.out.println(groupAnagrams(input));
	}
}
