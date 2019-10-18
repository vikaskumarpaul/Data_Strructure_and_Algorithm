package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Cisco
{
	public static void main(String[] args)
	{
		String s1 = "This is a fun interview";
		StringTokenizer token = new StringTokenizer(s1, " ");
		List<String> l1 = new ArrayList<String>();
		while (token.hasMoreElements())
		{
			l1.add(token.nextToken());
		}
		System.out.println("Original List: " + l1);

		Map<String, Integer> result = new HashMap<String, Integer>();

		l1.forEach(x -> {
			String Data = result.containsKey(x);
			if (Data.contains(x))
			{
				//Integer n = (Integer) result.get(x);
				result.remove(x);
				
				result.put(x +" "+x , ++n);
			} else
				result.put(x, x.length());
		});
		
		System.out.println(result);
	}
}
