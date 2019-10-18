package com.linkedlist;

public class LinkedListDemo
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
		Node n1 = new Node(data);
		n1.next = head;
		head = n1;
	}

	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.println(tnode.data);
			tnode = tnode.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedListDemo demo = new LinkedListDemo();

		demo.add(2);
		demo.add(21);
		demo.add(22);
		demo.add(23);
		demo.add(25);
		demo.add(27);
		demo.add(23);

		demo.printList();
	}

}
