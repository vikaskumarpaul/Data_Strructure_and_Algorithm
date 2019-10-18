package com.clone;

public class Test1
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Test t1 = new Test();
		System.out.println(t1.x +" "+t1.y);
		Test t2 = (Test)t1.clone();
		//Test t2 = t1;
		t2.x = 100;
		System.out.println(t1.x +" "+t1.y);
		System.out.println(t2.x +" "+t2.y);
	}
}
