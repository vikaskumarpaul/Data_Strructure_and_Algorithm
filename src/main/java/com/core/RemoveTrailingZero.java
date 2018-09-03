package com.core;

public class RemoveTrailingZero
{

	public static String removeZero(String str)
    {
        // Count trailing zeros
        int i = 0;
        while (str.charAt(i) == '0')
            i++;
 
        StringBuffer sb = new StringBuffer(str);
 
        // The  StringBuffer replace function removes
        // i characters from given index (0 here)
        sb.replace(0, i, "");
        System.out.println(i);
        return sb.toString();  // return in String
    }
 
    // Driver code
    public static void main (String[] args)
    {
        String str = "000001235069";
        str = removeZero(str);
        System.out.println(str);
    }

}
