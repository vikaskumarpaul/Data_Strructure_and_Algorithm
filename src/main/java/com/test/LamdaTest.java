package com.test;

import java.util.function.Function;

public class LamdaTest
{
	public static void main(String[] args)
	{
		
		Function<String, String> f1 = (String ss) -> {
			System.out.print(ss + " Loves");
			return " Priya";
		};
		
		System.out.print(f1.apply("vikas"));
		
		/*
		 * FirstInterface f1 = (String p1) -> System.out.println("abc: "+abc);
		 * 
		 * f1.hellostring(s1);
		 */
	}
}
