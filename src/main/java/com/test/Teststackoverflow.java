package com.test;

public class Teststackoverflow
{
	public static void main(String[] args)
	{
		AccountHolder ach = new AccountHolder();
		ach.setName("Shamik Mitra");
		Account acc = new Account();
		acc.setAccNumber("100sm");
		acc.setAccType("Savings");
		acc.setHolder(ach);
		ach.addAccount(acc);
		System.out.println(ach);
	}

}
