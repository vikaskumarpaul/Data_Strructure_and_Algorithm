package com.test;

import java.util.ArrayList;
import java.util.List;

public class AccountHolder
{
	private String name;
	private List<Account> accList = new ArrayList<Account>();

	public void addAccount(Account acc)
	{
		accList.add(acc);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "AccountHolder [name=" + name + ", accList=" + accList + "]";
	}
}
