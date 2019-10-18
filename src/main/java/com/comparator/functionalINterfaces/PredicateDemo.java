package com.comparator.functionalINterfaces;

import java.util.function.Predicate;

public class PredicateDemo
{
	public static void main(String[] args)
	{
		Predicate<Integer> value = (Integer x) -> {
			return x>10; 
		};
		
		System.out.println(value.test(20));
		
	}
	
	
}
