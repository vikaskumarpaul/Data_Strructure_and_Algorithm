package com.multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));  
		System.out.println("This Program Is Created For Checking Whether The Number Entered Is Palindrome, If Not Find The Nearest Palindrome..");  
		System.out.println("Please Enter Number:-");  
		int n=Integer.parseInt(A.readLine());
		int f=n;  
		System.out.println(Palindrome.Palindrome(f)); 
	}
	
	public static boolean Palindrome (int x)
	{
		int m= 0, r= 0, n = 0;
		boolean k;
		
	    for(int i=0;x>0;i++)
	    {
	    	m=x%10;
	        r=r*10+m;
	        x=x/10;   
	    }  
	    if(n==r)
	    {
	    	k=true;
	    }
	    else
	        k=false;
	    return k;
	}  
}
