package com.comparator;

import java.util.Comparator;

public class EmployeeChainedComparator1 implements Comparator<Employee1>
{

	Comparator<Employee1> a1[];

	EmployeeChainedComparator1(Comparator<Employee1>... comparators)
	{
		a1 = comparators;
	}

	@Override
	public int compare(Employee1 o1, Employee1 o2)
	{

		for (Comparator<Employee1> c1 : a1)
		{
			int result = c1.compare(o1, o2);
			if (result != 0)
				return result;
		}
		return 0;
	}

}
