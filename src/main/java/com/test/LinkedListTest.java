package com.test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest
{
	public static void main(String[] args)
	{
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(20);
		l1.add(34);
		l1.add(56);
		l1.add(12);
		
		Iterator<Integer> it = l1.iterator();
		
		while (it.hasNext())
		{
			int a = it.next();
			System.out.println(a);
		}
	}
}

