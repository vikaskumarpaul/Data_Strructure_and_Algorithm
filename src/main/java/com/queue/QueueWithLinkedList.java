package com.queue;

public class QueueWithLinkedList
{
	
	Node front;
	Node rear;
	
	QueueWithLinkedList()
	{
		this.front = this.rear = null;
	}
	
	public void enqueue(int key)
	{
		Node temp = new Node(key);
		
		//since first node
		if(this.rear == null)
		{
			this.front = temp;
			this.rear = temp;
			return;
		}
		
		this.rear.next = temp;
		this.rear = temp;
	}
	
	public void dequeue()
	{
		if(this.front == null)
		{
			System.out.println("queue is empty");
			return;
		}
		
		Node temp = this.front; 
		this.front = front.next;
		
		//after removing a single element if front is null then put rear as null 
		if(front == null)
		{
			this.rear = null;
		}
	}

	public void printElements()
	{
		if(this.rear == null)
		{
			System.out.println("Empty queue");
		}
		while(this.front != null)
		{
			Node node= this.front;
			System.out.println(node.key);
			this.front = front.next;
		}
		
	}
}
class Node
{
	int key;
	Node next;
	
	Node(int key)
	{
		this.key = key;
		this.next = null;
	}
}