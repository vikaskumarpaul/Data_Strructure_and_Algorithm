package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingMultipleattributes
{
	public static void main(String[] args)
	{
		System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");

		List<Employee1> listEmployees = new ArrayList<Employee1>();

		listEmployees.add(new Employee1("Tom", "Developer", 45, 80000));
		listEmployees.add(new Employee1("Sam", "Designer", 30, 75000));
		listEmployees.add(new Employee1("Bob", "Designer", 45, 134000));
		listEmployees.add(new Employee1("Peter", "Programmer", 25, 60000));
		listEmployees.add(new Employee1("Tim", "Designer", 45, 130000));
		listEmployees.add(new Employee1("Craig", "Programmer", 30, 52000));
		listEmployees.add(new Employee1("Anne", "Programmer", 25, 51000));
		listEmployees.add(new Employee1("Alex", "Designer", 30, 120000));
		listEmployees.add(new Employee1("Bill", "Programmer", 22, 30000));
		listEmployees.add(new Employee1("Samuel", "Developer", 28, 80000));
		listEmployees.add(new Employee1("John", "Developer", 35, 67000));
		listEmployees.add(new Employee1("Patrick", "Developer", 35, 140000));
		listEmployees.add(new Employee1("Alice", "Programmer", 35, 80000));
		listEmployees.add(new Employee1("David", "Developer", 35, 99000));
		listEmployees.add(new Employee1("Jane", "Designer", 30, 82000));

		System.out.println("*** Before sorting:");

		for (Employee1 emp : listEmployees)
		{
			System.out.println(emp);
		}

		/*
		 * Collections.sort(listEmployees, new EmployeeJobTitleComparator1()
		 * .thenComparing(new EmployeeAgeComparator1()) .thenComparing(new
		 * EmployeeSalaryComparator1()));
		 */
		Comparator<Employee1> cc = Comparator.comparing(Employee1::getName).thenComparing(Employee1::getDesignation).thenComparing(Employee1::getAge);
		listEmployees.sort(cc);
		System.out.println("\n*** After sorting:");

		for (Employee1 emp : listEmployees)
		{
			System.out.println(emp);
		}
	}
}
