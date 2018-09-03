package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionTest
{
	public static void main(String[] args)
	{
//		ArrayList<String> l1 = new ArrayList<>();
//		HashSet<String> h1 = new HashSet<>();
		HashMap<Integer, String> h1 = new HashMap<>();
		System.out.println(h1.put(5, "Hello"));
		System.out.println(h1.put(5, "Vikas"));
	}
}
