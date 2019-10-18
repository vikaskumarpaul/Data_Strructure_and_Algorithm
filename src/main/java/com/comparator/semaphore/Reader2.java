package com.comparator.semaphore;

import java.util.Optional;

public class Reader2 implements Runnable
{
	String DbInit;
	Reader2(String DataSource)
	{
		this.DbInit = DataSource;
	}
	
	@Override
	public void run()
	{
		Optional<Object> data = DbInit.getName(@param(Name) String name);
		//pust to ES
	}
}
