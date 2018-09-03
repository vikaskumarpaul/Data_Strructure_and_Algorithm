package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest 
{
	public static void main(String[] args)
	{
		ArrayList<String> s1 = new ArrayList<String>();
		
		s1.add("pen");
		s1.add("aen");
		s1.add("ren");
		s1.add("yen");
		s1.add("gfen");
		
		System.out.println("Before Sorting....");
		for(String a:s1)
		{
			System.out.println(a);
		}
		
		Collections.sort(s1, Collections.reverseOrder());
		
		System.out.println("After Sorting");
		for(String a:s1)
		{
			System.out.println(a);
		}
	}
}
