package com.anonymous;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test17
{
	static int[] Find_K(int K, int[] Score, int N){
        Map<Integer, Integer> data = new TreeMap<>();
        int[] result = new int[K];
        for(int i = 0; i<Score.length; i++)
        {
            data.put(Score[i], i+1);
        }
        
        int counter = Score.length-K;
        
        int resultIndex = result.length-1;
        
        int marker = 0;
        Iterator<Entry<Integer, Integer>> iteratorData = data.entrySet().iterator();
        while(iteratorData.hasNext())
        {
        	Entry<Integer, Integer> dataset = iteratorData.next(); 
        	if(marker>=counter)
        	{
        		result[resultIndex] = dataset.getValue();
        		resultIndex--;
        	}
        	marker++;
        }
        
		/*
		 * for(Entry<Integer, Integer> dataset : data.entrySet()) {
		 * if(marker>=counter) { result[resultIndex] = dataset.getValue();
		 * resultIndex--; } marker++; }
		 */
        
        return result;
    
    }
	
	public static void main(String[] args)
	{
		int Score[] = new int[] {25, 5, 17, 10 , 45};
		int N = 5;
		int K = 3;
		
		int [] value = Find_K(K, Score, N);
		for(int valu:value)
		{
			System.out.println(valu);
		}
	}
}
