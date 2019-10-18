package com.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Driver1
{
	ArrayList<String> str = new ArrayList<String>();

	void test1()
	{
		int i = 0;
		Stream<String> s1 = Arrays.asList("s1", "s2").stream();
		s1.forEach(ss ->{
			System.out.println(ss+i);
		});
	}
	
	public static void main(String[] args)
	{
		int i = 10;
		Driver1 d1 = new Driver1();
		d1.test1();
		
	}
}
