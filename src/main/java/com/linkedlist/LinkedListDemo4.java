package com.linkedlist;

public class LinkedListDemo4
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

	public void print()
	{
		Node nn = head;
		while (nn.next != null)
		{
			System.out.println(nn.data);

			nn = nn.next;
		}
	}

	public void remove(int data)
	{
		Node nn = head, prev = null;

		while (nn.next != null && nn.data == data)
		{
			prev = nn;
			nn = nn.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedListDemo4 l4 = new LinkedListDemo4();

		l4.add(6);
		l4.add(5);
		l4.add(9);
		l4.add(3);
		l4.add(622);

		System.out.println("Before Remove....");
		l4.print();
		
		System.out.println("After Remove....");
		l4.remove(9);
		l4.print();
	}
}
