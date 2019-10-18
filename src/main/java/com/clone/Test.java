package com.clone;

public class Test implements Cloneable
{
	int x = 10;
	int y = 20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
