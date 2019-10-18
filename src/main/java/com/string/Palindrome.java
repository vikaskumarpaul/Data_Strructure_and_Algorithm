package com.string;

public class Palindrome
{

	public boolean palindromeChecker(String s1)
	{
		int start = 0;
		int end = s1.length() - 1;

		while (start < end)
		{
			if (!(s1.charAt(start++) == s1.charAt(end--)))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s1 = "vikbkiv";
		Palindrome p1 = new Palindrome();
		System.out.println(p1.palindromeChecker(s1));
	}
}
