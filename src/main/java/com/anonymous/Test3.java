package com.anonymous;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test3
{

	String rearrangeTheSentence(String sentence)
	{

		String splitedSentence[] = sentence.split("[, ?.@]+");

		SortedMap<Integer, String> s1 = new TreeMap<Integer, String>();

		for (String p1 : splitedSentence)
		{
			if (s1.containsKey(p1.length()))
			{
				String value = s1.get(p1.length());

				s1.put(p1.length(), value + " " + p1);
			} else
			{
				s1.put(p1.length(), p1);
			}
		}
		StringBuilder builder = new StringBuilder();

		Set<Map.Entry<Integer, String>> m1 = s1.entrySet();
		for (Map.Entry<Integer, String> p1 : m1)
		{
			builder.append(" ");
			builder.append(p1.getValue().toLowerCase());
		}

		if (sentence.contains("."))
		{
			builder.append(".");
		}
		String result = builder.toString().trim();

		String finala = result.substring(0, 1).toUpperCase();
		finala = finala + result.substring(1, result.length());

		return finala;
	}

	public static void main(String[] args)
	{
		String s1 = "Houston we have a problem.";
		Test3 t3 = new Test3();

		System.out.println(t3.rearrangeTheSentence(s1));
	}
}
