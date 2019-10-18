package com.linkedlist;

public class LinkedListDemo3
{
	
	Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void add(int data)
	{
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void print()
	{
		Node nnode = head;
		while(nnode != null)
		{
			System.out.println(nnode.data);
			nnode = nnode.next;
		}
	}
	
	public void remove(int data)
	{
		Node toremove = head;
		while(toremove != null)
		{
			if(toremove.data == data)
			{
				toremove.next = head;
				//head = toremove;
			}
			toremove = toremove.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedListDemo3 demo = new LinkedListDemo3();
		
		demo.add(1);
		demo.add(5);
		demo.add(7);
		demo.add(8);
		demo.add(3);
		demo.add(9);
		
		System.out.println("Before Remove......");
		demo.print();
		
		System.out.println("After Remove......");
		demo.remove(7);
		demo.print();
	}
}
