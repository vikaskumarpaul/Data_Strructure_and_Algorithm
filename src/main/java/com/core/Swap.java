package com.core;

public class Swap
{

	public static void main(String[] args)
	{
		String a = "abc";
        String b = "World";
        System.out.println("Strings before swap: a = " +a+ " and b = "+b);
        a = a+b;
        b = a.substring(0,(a.length()-b.length()));
        a = a.substring(b.length());
        System.out.println("Strings after swap: a = " + a + " and b = " + b);
	}

}
