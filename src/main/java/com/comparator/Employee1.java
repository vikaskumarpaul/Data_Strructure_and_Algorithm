package com.comparator;

public class Employee1
{
	private String name;
	private String designation;
	private int age;
	private long salary;

	public Employee1(String name, String designation, int age, long salary)
	{
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDesignation()
	{
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public long getSalary()
	{
		return salary;
	}
	public void setSalary(long salary)
	{
		this.salary = salary;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result
				+ ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (age != other.age)
			return false;
		if (designation == null)
		{
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "Employee1 [name=" + name + ", designation=" + designation
				+ ", age=" + age + ", salary=" + salary + "]";
	}

}
