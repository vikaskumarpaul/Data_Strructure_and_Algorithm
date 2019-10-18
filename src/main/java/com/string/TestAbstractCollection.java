package com.string;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class TestAbstractCollection
{
	public static void main(String[] args)
	{
		AbstractCollection coll = new ArrayList();
		coll.add("Vikas");
		coll.add("Vikas1");
		coll.add("Vika2");
		coll.add("Vikas3");
		coll.add("Vikas4");
		
		
		System.out.println(coll);
	}
}
