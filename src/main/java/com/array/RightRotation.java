package com.array;

public class RightRotation
{
	public static void main(String[] args)
	{
		int arr[] =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int n = arr.length;
		int k = 3;

		rightRotate(arr, k, n);

	}

	private static void rightRotate(int[] arr, int k, int n)
	{
		int a = 0;
		while (a < k)
		{
			int temp = arr[n-1];
			for (int i = n-1; i>0; i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			a++;
		}
	}
}
