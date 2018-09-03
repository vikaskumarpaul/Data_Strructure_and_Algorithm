package com.test;


class LinkedList
{
    Node head; 
 
    /* Linked list Node*/
    static class Node
    {
        int data;
        Node next;
        
        Node(int d) 
        {
        	data = d;
        	next = null;
        }
    }
}