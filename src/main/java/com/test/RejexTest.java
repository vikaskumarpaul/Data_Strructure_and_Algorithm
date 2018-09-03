package com.test;

import java.util.regex.Pattern;

public class RejexTest
{
	public static void main(String[] args)
	{
		String rex1 = "[asp]";
		String input = "vikaspaul";
		
		
/*		Pattern p = Pattern.compile(rex1);
		Matcher m1 = p.matcher(input);*/
		
		System.out.println(input.contains(rex1));
	}
}
