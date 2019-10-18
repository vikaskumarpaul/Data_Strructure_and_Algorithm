package com.linkedlist;

public class LinkedListDemo1
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
		if (head == null)
		{
			head = new Node(data);
			return;
		}

		while (head != null)
		{
			if (head.next == null)
			{
				head.next = new Node(data);
				head = 
			}
			head = head.next;
		}

	}

	public void remove(int data)
	{
		Node temp = head, prev = null;

		// if head itself to be deleted
		if (temp != null && temp.data == data)
		{
			head = temp.next;
			temp = null;// just for GC
			return;
		}

		while (temp != null)
		{
			if (temp.data == data)
			{
				prev.next = temp.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}

	}

	public void printall()
	{
		Node n1 = head;

		while (n1 != null)
		{
			System.out.println(n1.data);
			n1 = n1.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedListDemo1 d1 = new LinkedListDemo1();
		d1.add(12);
		d1.add(34);
		d1.add(31);
		d1.add(67);
		d1.add(46);

		System.out.println("Before Remove......");
		d1.printall();

		d1.remove(12);
		System.out.println("After Remove......");
		d1.printall();
	}
}
