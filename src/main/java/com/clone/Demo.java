package com.clone;

public class Demo
{
	class Node
	{
		Node next;
		int value;
		Node(int value)
		{
			next = null;
			this.value = value; 
		}
	}
	
	public int kemementFinder(int k, Node Head)
	{
		if(Head != null)
		{
			return 0;
		}
		int length = 0;
		Node nodedata = Head;
		while(nodedata != null)
		{
			nodedata = nodedata.next;
			length++;
		}
		int index = length-k-1;
		int temp = 0;		
		int returnvalue = 0;
		while(temp<=index)
		{
			Node value = Head;
			returnvalue = value.value;
			temp++;
		}
		
		return returnvalue;
	}
	
	public static void main(String[] args)
	{
		Node data = new Node(20);
		
	}
}
