package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayRotation
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reverse_factor = br.readLine();
		System.out.println(reverse_factor);
		int arr[] = {1, 2, 3, 4, 5};
		int reversing_index = (arr.length)-Integer.parseInt(reverse_factor);
		System.out.println(reversing_index);
		int result[] = new int[arr.length];
		
		
	}
}
