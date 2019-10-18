package com.multithreading;

public class Test
{
	public static int solution(int[] A)
	{

		int count = 0;
		for (int i = 0; i < A.length-1; i++)
		{
			if (A[i] == -1)
			{
				int temp = A[A.length - 1];
				A[A.length - 1] = A[i];
				A[i] = temp;
				++count;
			}
		}

		return (A.length - count);
	}

	public static void main(String[] args)
	{
		int a[] =
		{1, 4, -1, 3, 2};
		System.out.println(solution(a));
	}
}
