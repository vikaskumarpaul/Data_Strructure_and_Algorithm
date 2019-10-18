package com.linkedlist;

public class LinkedListDemo2<T>
{
	Node head;
	class Node<T>
	{
		T data;
		Node next;
		
		Node(T data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void addData(T data)
	{
		Node n1 = new Node(data);
		n1.next = head;
		head = n1;
	}
	
	public void printData()
	{
		Node tnode = head; 
		
		while(null != tnode)
		{
			System.out.println(tnode.data);
			tnode = tnode.next;
		}
		
	}
}
