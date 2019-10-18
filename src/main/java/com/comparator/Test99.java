package com.comparator;

public class Test99
{
	private int[] rotateones(int a[], int length)
	{
	    int temp = a[0];
	    a[0] = a[length-1];
	    a[length-1] = temp;
	    
	    return a;
	}

	private void rotatearray(int a[], int k)
	{
	    for(int x = 0; x<k-1; x++)
	    {
	        rotateones(a, a.length);    
	    }
	    print(a);
	}
	
	private void print(int[] a)
	{
		for(int z: a)
		{
			System.out.print(z);
		}
		
	}

	public static void main(String[] args)
	{
	    int a[] = {1, 2, 3, 4, 5};
	    int k = 3;
	    Test99 tt = new Test99();
	    tt.rotatearray(a, k);
	    
	}
}
