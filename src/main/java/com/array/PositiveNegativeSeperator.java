package com.array;

public class PositiveNegativeSeperator
{
	public static void main(String[] args)
	{
		int arr[]  = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				continue;
			}
			
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>0)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
}
