package com.core;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Stringjoiner
{

	public static void main(String[] args)
	{
		List<String> data = Arrays.asList("Hello", "hi", "pop", "push");
		
		StringJoiner joiner = new StringJoiner(";");
		
		data.forEach(value ->{
			joiner.add(value);
		});
		
		System.out.println(joiner.toString());
	}

}
