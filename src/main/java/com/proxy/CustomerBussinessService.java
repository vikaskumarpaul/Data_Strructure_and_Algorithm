package com.proxy;

public class CustomerBussinessService implements CustomerService
{
	@Override
	public void saveCustomer()
	{
		System.out.println("Saving Customer..........");
	}
}
