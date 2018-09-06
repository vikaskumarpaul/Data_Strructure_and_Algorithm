package com.multithreading;

public class Palindromecheck
{
	public int findNearestPalindrome(int numberEntered) 
	{
        int lowerPalidrome = getLowerPalindrome(numberEntered);
        int higherPalindrome = getHigherPalindrome(numberEntered);
        if (Math.abs(numberEntered - lowerPalidrome) < Math.abs(numberEntered - higherPalindrome))
        {
            return lowerPalidrome;
        } 
        else 
        {
            return higherPalindrome;
        }
    }

	public int getLowerPalindrome(int baseNumber)
	{
		int m, r = 0;
		for(int i=0;baseNumber>0;i++)
	       {
	           m=baseNumber%10;
	           r=r*10+m;
	           baseNumber=baseNumber/10;   
	       }  
		return r;
	}

	public int getHigherPalindrome(int baseNumber)
	{
		int m, r = 0;
		for(int i=0;baseNumber>0;i++)
	       {
	           m=baseNumber%10;
	           r=r*10+m;
	           baseNumber=baseNumber/10;   
	       }  
		return r;
	}
}
