package com.test;

public class Account
{
	private String accNumber;
	private String accType;
	private AccountHolder holder;

	public String getAccNumber()
	{
		return accNumber;
	}

	public void setAccNumber(String accNumber)
	{
		this.accNumber = accNumber;
	}

	public String getAccType()
	{
		return accType;
	}

	public void setAccType(String accType)
	{
		this.accType = accType;
	}

	public AccountHolder getHolder()
	{
		return holder;
	}

	public void setHolder(AccountHolder holder)
	{
		this.holder = holder;
	}

	@Override
	public String toString()
	{
		return "Account [accNumber=" + accNumber + ", accType=" + accType + ", holder=" + holder + "]";
	}

}
