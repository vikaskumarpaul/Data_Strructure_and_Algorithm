package com.array;

public class KthusingHeap
{
	public static void main(String[] args)
	{
		Integer arr[] = {12, -3, 5, -7, 4, 19, -26};
		
		int key, j; 
        for (int i = 1; i < arr.length; i++) { 
            key = arr[i]; 
  
            // if current element is positive 
            // do nothing 
            if (key > 0) 
                continue; 
  
            /* if current element is negative, 
            shift positive elements of arr[0..i-1], 
            to one position to their right */
            j = i - 1; 
            while (j >= 0 && arr[j] > 0) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
  
            // Put negative element at its right position 
            arr[j + 1] = key; 
        } 
	}
}
