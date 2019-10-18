package com.queue;

public class TestQueue
{
	public static void main(String[] args)
	{
		QueueWithLinkedList l1 = new QueueWithLinkedList();
		
		l1.enqueue(10);
		l1.enqueue(20);
		l1.enqueue(30);
		l1.enqueue(40);
		l1.enqueue(50);
		l1.enqueue(60);
		l1.enqueue(70);
		
		System.out.println("Before dequeue");
		l1.printElements();
		
		l1.dequeue();
		System.out.println("after dequeue");
		l1.printElements();
	}
}
