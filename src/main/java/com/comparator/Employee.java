package com.comparator;

public class Employee
{
	private String name;
	private String jobTitle;
	private int age;
	private int salary;
	
	public Employee(String name, String jobTitle, int age, int salary)
	{
		this.age = age;
		this.jobTitle = jobTitle;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getJobTitle()
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
}
