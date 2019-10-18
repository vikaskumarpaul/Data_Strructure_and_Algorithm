package com.anonymous;

import java.util.Arrays;
import java.util.List;

public class Test12 extends Thread
{

	public static long largestRepackaged(List<Integer> arrivingPackets)
	{
		long result  = 0;
		
		int change[] = new int[arrivingPackets.size()];
		
		for(int i = 0; i<arrivingPackets.size(); i++)
		{
			change[i] = arrivingPackets.get(i);
		}
		
		return result;
	}
	public static void main(String[] ar)
	{
		List<Integer> arrivingpackage = Arrays.asList(3, 4, 3);
		System.out.println(largestRepackaged(arrivingpackage));
	}
}
