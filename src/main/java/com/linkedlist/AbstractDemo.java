package com.linkedlist;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class AbstractDemo
{
	public static void main(String[] args)
	{
		AbstractCollection<Integer> aa = new ArrayList<Integer>();
		aa.add(1);
		aa.add(101);
		aa.add(1001);
		aa.add(10001);
		aa.add(100001);
		
		aa.remove(101);
		System.out.println(aa);
	}
}
