package com.linkedlist;

public class LinkedList
{
	static Node head;

	static class Node
	{
		Node next;
		int value;

		Node(int value)
		{
			this.next = null;
			this.value = value;
		}
	}

	static void printelements(Node value)
	{
		while (value != null)
		{
			System.out.println(value.value);
			value = value.next;
		}
	}

	static Node reverse(Node value)
	{
		Node prev = null;
		Node current = value;
		Node next = null;

		while (current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
		return head;
	}

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		list.head.next.next.next.next = new Node(50);
		list.head.next.next.next.next.next = new Node(60);

		System.out.println("Before reverse....");
		printelements(list.head);

		Node afterreverse = reverse(list.head);
		System.out.println("after reverse.....");
		printelements(afterreverse);
	}
}
