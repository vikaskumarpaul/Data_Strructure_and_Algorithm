package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList
{
	public static void main(String[] args)
	{
		List<String> l1 = new ArrayList<String>();
		
		l1.add("pen");
		l1.add("sdfn");
		l1.add("asgdn");
		l1.add("egn");
		l1.add("hhn");
		l1.add("hfn");
		l1.add("rutn");
		
		List<String> un = Collections.unmodifiableList(l1);
		un.remove(2);
		for(String a:l1)
		{
			System.out.println(a);
		}
		
		System.out.println("Adding element...");
		
		l1.add("Hello");
		
		System.out.println("Addition Done");
		for(String a:l1)
		{
			System.out.println(a);
		}
		
		com.google.common.collect.ImmutableList<E>
	}
}
