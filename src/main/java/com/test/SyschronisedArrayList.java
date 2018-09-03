package com.test;

import java.util.ArrayList;

public class SyschronisedArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> nonal = new ArrayList<>();
		nonal.add("abc");
		nonal.add("def");
		nonal.add("ghi");
		nonal.add("jkl");
		nonal.add("mno");
		
		Iterable<String> itr = nonal.iterator();
	}
}
