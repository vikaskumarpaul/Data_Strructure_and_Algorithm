package com.anonymous;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test7
{
	public static void main(String[] args)
	{
		Scanner ins = new Scanner(System.in);
		String ip = ins.nextLine();

		String[] na = ip.split(" ");
		int noi = Integer.parseInt(na[0]);
		int[] in = new int[noi];
		for (int i = 1; i <= noi; i++)
		{
			in[i - 1] = Integer.parseInt(na[i]);
		}
		System.out.println(FN(in));
	}
	public static int FN(int[] ins)
	{
		int result = 0;

		Map<Integer, Integer> datavalue = new HashMap<Integer, Integer>();

		for (int j = 1; j <= 9; j++)
		{
			Set<Integer> s1 = new HashSet();
			for (int i = 0; i < ins.length; i++)
			{
				s1.add(ins[i] % j);
			}
			datavalue.put(j, datavalue.size());
		}
		Iterator<Map.Entry<Integer, Integer>> finalData = datavalue.entrySet()
				.iterator();
		while (finalData.hasNext())
		{
			Entry<Integer, Integer> data = finalData.next();

			if (data.getValue() == ins.length)
			{
				result = data.getValue();
			}
		}

		return result;

	}
}
