package com.searching;

public class BinarySearch
{
	private static int binarysearch(int a[], int fromIndex, int toIndex,
			int key)
	{
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high)
		{
			int mid = (low + high) >>> 1;
			long midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		System.out.println("finally low = "+ low);
		return -(low + 1); // key not found.
	}
	
	public static void main(String[] args)
	{
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
		System.out.println(binarysearch(a, 0, a.length, 10));
	}
}
