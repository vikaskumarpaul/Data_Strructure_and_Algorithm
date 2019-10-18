package com.anonymous;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        Map<String, Integer> dataData = new HashMap<>();
        data = data.replaceAll(" ", "");
        for(int i = 0; i<data.length(); i++)
        {
            String temp = ""+data.charAt(i);
            if(dataData.containsKey(temp))
            {
                Integer value = dataData.get(temp);
                dataData.put(temp, ++value);
            }
            else
            {
                dataData.put(temp, 1);
            }
        }
        Iterator<Map.Entry<String,Integer>> itr = dataData.entrySet().iterator();
        
        StringBuilder builder = new StringBuilder();
        while(itr.hasNext())
        {
        	Map.Entry<String, Integer> finbalvalue = itr.next();
        	if(finbalvalue.getValue()==2)
        	{
        		builder.append(finbalvalue.getKey());
        		builder.append(" ");
        	}
        }
        if(builder.length()>0)
        {
        System.out.println(builder.toString().trim());
        }
        else
        {
        	System.out.println("No Duplicate");
        }
	}
}
