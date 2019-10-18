package com.comparator;

import java.util.Comparator;

public class EmployeeJobTitleComparator1 implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 o1, Employee1 o2)
	{
		return o1.getDesignation().compareTo(o2.getDesignation());
	}
}
