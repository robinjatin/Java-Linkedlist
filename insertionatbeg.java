package linkedlist;

import linkedlist.LinkedList1.Node;

public class LinkedList2 {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static LinkedList2 addBeg(LinkedList2 li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
			
		{
			li.head=newNode;
		}
		else
		{
			Node first=li.head;
			li.head=newNode;
			newNode.next=first;
		}
		return li;
	}
	public static void display(LinkedList2 li)
	{
		Node current=li.head;
		System.out.println("The LinkedList is as follows: ");
		while(current.next!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		System.out.print(current.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList2 li=new LinkedList2();
		li.addBeg(li, 10);
		li.addBeg(li,20);
		li.display(li);
	}

}
