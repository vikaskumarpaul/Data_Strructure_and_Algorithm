package com.anonymous;

public class Test4
{
	
	long arrayTrip(int[] arr, int k) 
	{
	    long result = 0;
	    
	    int lengthValue = arr.length;
	    
	    for(int i = 0; i< lengthValue-1; i++)
	    {
	    	if(arr[i]>0)
	    	{
	    		result += arr[i];
	    	}
	    	else
	    	{
	    		int min = arr[i];
	    		
	    		while(i<k)
	    		{
	    			
	    		}
	    	}
	    }
	    
	    return result;
	}
	
	public static void main(String[] args)
	{
		Test4 t4 = new Test4();
		int k = 2;
		int arr[] = {3, 4, -2, 1, 2};
		
		System.out.println(t4.arrayTrip(arr, k));
	}
}
