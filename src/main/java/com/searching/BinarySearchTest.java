package com.searching;

public class BinarySearchTest
{
	private static int searctest(int a[], int start, int end, int key)
	{
		int result = 0;

		int first = start;
		int last = end - 1;

		while (first <= last)
		{
			int mid = (first + last) >>> 1;
			int midval = a[mid];

			if (midval < key)
				first = mid + 1;
			else if (midval > key)
			{
				last = mid - 1;
			} else
			{
				return mid;
			}
		}
		
		result = -(first+1);
		
		return result;
	}
	
	public static void main(String[] args)
	{
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(searctest(a, 0, a.length, 9));
	}
}
