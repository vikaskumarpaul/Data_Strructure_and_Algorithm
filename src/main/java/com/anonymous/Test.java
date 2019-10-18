package com.anonymous;

import java.util.Arrays;

public class Test
{
	public static void main(String args[])
	{
		String effectiveFinal = "I am non final local variable";
		Runnable r = () -> {
			effectiveFinal = effectiveFinal+"abc";
			System.out.println(
					"Value of effectively variable is : " + effectiveFinal);
		};
		StringBuilder builder = new StringBuilder();
		builder.append(b)
		Thread t = new Thread(r);
		t.start();
	}

}
