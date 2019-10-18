package com.deadlock;

public class Util
{
	static void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
