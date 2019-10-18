package com.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class TestPredicate
{

	public static <A> List<A> remove(List<A> l, Predicate<A> p)
	{
		Iterator<A> itr = l.iterator();

		// Find and remove all null
		while (itr.hasNext())
		{

			// Fetching the next element
			A t = itr.next();

			// Checking for Predicate condition
			if (p.test(t))
			{

				// If the condition matches,
				// remove that element
				itr.remove();
			}
		}

		// Return the null
		return l;
	}

	public static void main(String[] args)
	{
		List<String> l1 = Arrays.asList("vikas", null, "Kumar", null, "Paul");

		Predicate<String> isnull = iteam -> Objects.nonNull(iteam);

		l1 = remove(l1, isnull);

		System.out.println(l1);
	}
}
