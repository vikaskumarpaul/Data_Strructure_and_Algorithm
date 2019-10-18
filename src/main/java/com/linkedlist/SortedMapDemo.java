package com.linkedlist;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo
{
	public static void main(String[] args)
	{
		SortedMap<Integer, String> sortedmap = new TreeMap<Integer, String>();
		sortedmap.put(10, "hello");
		sortedmap.put(12, "hello");
		sortedmap.put(9, "hello");
		sortedmap.put(90, "hello");
		sortedmap.put(34, "hello");
		sortedmap.put(2, "hello");
		
		System.out.println(sortedmap);
	}
}
