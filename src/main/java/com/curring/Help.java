package com.curring;

import java.util.function.Function;

public class Help
{
	public static void main(String[] args)
	{
		Function<Integer, Function<Integer, Function<Integer, Integer>>> triadder = u -> w -> v -> u
				+ w + v;

		// Calling the curried functions

		// Calling Curried Function for Adding u, v & w
		System.out.println("Add 2, 3, 4 :" + triadder.apply(2).apply(3).apply(4));
	}
}
