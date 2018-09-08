package com.linkedlist;

import java.util.Stack;


public class QueueTest
{
	public static void main(String[] args)
	{
		Stack<String> s1 = new Stack<>();
		s1.push("ad");
		s1.push("zsfg");
		s1.push("zxfb");
		s1.push("ADSF");
		s1.push("SDG");
		s1.push("DGH");
		
		
		System.out.println("peek: "+s1.peek());
		System.out.println("pop: "+s1.pop());
		
		for(String s: s1)
		{
			System.out.println(s);
		}
	}
}
