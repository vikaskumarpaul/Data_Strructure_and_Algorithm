package com.anonymous;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		data.is
		String[] splittedData = data.split(" ");
		
		String dataToOperate = splittedData[1];
		
		String dataAfterKill = dataToOperate.replaceAll("AT", "T");
		System.out.println("Data After Kill: "+ dataAfterKill);
		Map<String, Integer> dataData = new HashMap<>();
		for(int i = 0; i<dataAfterKill.length(); i++)
        {
            String temp = ""+dataAfterKill.charAt(i);
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
		System.out.println("DataData: "+ dataData);
        
        int antCount = dataData.get("A");
        int termitesCount = dataData.get("T");
        if(antCount>termitesCount)
        {
        	System.out.println("Ants");
        }
        else if(antCount<termitesCount)
        {
        	System.out.println("Termites");
        }
        else
        {
        	System.out.println("Tie");
        }
	}
}
