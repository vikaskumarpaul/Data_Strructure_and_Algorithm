package com.anonymous;

public class Test15
{
	static int FindRoot(int no1, int no2)
	{
		int cnt = 0;

		for (int i = no1; i <= no2; i++)
			for (int j = 1; j * j <= i; j++)
				if (j * j == i)
				{
					System.out.println(j*j);
					cnt++;
					for(int p = 1; p*p<=j; p++)
					{
						if(p*p==j)
						{
							cnt++;
						}
					}
				}
		return cnt;
	}

	public static void main(String[] args)
	{
		System.out.println(FindRoot(6000, 7000));
	}
}
