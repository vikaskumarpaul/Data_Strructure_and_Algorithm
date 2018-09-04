package com.multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Process 
{
	private static List<Integer> cachelist = new LinkedList();
	
	public static List<Integer> getList()
	{
		return cachelist;
	}
}
