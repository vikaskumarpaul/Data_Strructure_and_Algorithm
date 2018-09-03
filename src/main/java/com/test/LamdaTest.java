package com.test;
public class LamdaTest
{
	public static void main(String[] args)
	{
		FirstInterface f1 = (String abc) -> 
		{
			System.out.println("abc: "+abc);
		};
		
		f1.singleMethod("Vikas");
	}
}
