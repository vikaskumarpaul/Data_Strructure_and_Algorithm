package com.string;

import java.util.StringJoiner;

public class TestStringJoiner
{
	public static void main(String[] args)
	{
		StringJoiner joiner = new StringJoiner(":", "[", "]");
		joiner.add("vikas").add("kumar").add("paul");
		System.out.println(joiner);
	}
}
