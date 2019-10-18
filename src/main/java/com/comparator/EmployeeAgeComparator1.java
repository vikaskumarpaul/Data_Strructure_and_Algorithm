package com.comparator;

import java.util.Comparator;

public class EmployeeAgeComparator1 implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 o1, Employee1 o2)
	{
		if (o1.getAge() < o2.getAge())
			return -1;
		else if (o1.getAge() > o2.getAge())
			return 1;
		else
			return 0;
	}
}
