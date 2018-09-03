package com.test;


public class Student
{
	private int id;
	private String name;
	private int index;
	
	public Student(int id, String name, int index)
	{
		this.id = id;
		this.name = name;
		this.index = index;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name+""+index;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getIndex()
	{
		return index;
	}

	public void setIndex(int index)
	{
		this.index = index;
	}
	
	
}
