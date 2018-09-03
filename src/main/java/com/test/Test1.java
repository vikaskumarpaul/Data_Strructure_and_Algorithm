package com.test;

//Input: dq$#bvfghz^&pkh&*jyt
public class Test1
{
	public static void main(String[] args)
	{
		String input = "dq$#bvfghz^&pkh&*jyt";
		String output;
		
		StringBuffer temp = new StringBuffer(input.replaceAll("[^A-Z a-z]", "")).reverse();
		String spclchar = input.replaceAll("[A-Z a-z]", "");
		System.out.println(temp);
		System.out.println(spclchar);
		
		int charindex[] = new int[input.length()];
		
		for(int i: charindex)
		{
			
		}
	}
}
