package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ExpediaTest
{
	public static void main(String[] args)
	{
		String input = "2963162";
		char a[] = input.toCharArray();
		Integer x[] = new Integer[a.length];
		for(int i = 0; i<a.length; i++)
		{
			x[i] = (((int)a[i])-((int)'0'));
		}
		
		List<Integer> l1 = Arrays.asList(x);
		Collections.sort(l1);
		
		for(Integer p: l1)
		{
			System.out.println(p);
		}
	}
}
