package com.search;

import java.util.Arrays;

public class SortedAndRotated
{
	public static void main(String[] args)
	{
		int arr1[] =
		{1, 2, 3, 5, 6, 7, 8, 9, 10};
		int n = arr1.length;
		int key = 3;
		System.out.println("Index of the element is : "
				+ pivotedBinarySearch(arr1, n, key));
	}

	private static int pivotedBinarySearch(int[] arr1, int n, int key)
	{
		int mid = n / 2;

		if (arr1[mid] == key)
			return mid;
		else if (key > arr1[mid])
		{
			int[] a = subarray(arr1, mid + 1, arr1.length-1);
			pivotedBinarySearch(a, a.length-1, key);
		} else
		{
			int[] a = subarray(arr1, 0, mid - 1);
			pivotedBinarySearch(a, a.length-1, key);
		}
		return 0;
	}

	private static int[] subarray(int arr1[], int inderfrom, int indexlast)
	{
		return Arrays.copyOfRange(arr1, inderfrom, indexlast);
	}
}
