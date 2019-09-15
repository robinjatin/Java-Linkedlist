package linkedlist;

import linkedlist.LinkedList2.Node;

public class LinkedList3 {
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
	public static LinkedList3 insert(LinkedList3 li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
			li.head=newNode;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	public static LinkedList3 delete(LinkedList3 li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
			
		{
			li.head=newNode;
		}
		else
		{
			Node current=li.head;
			while(current.next.next!=null)
			{
				current=current.next;
			}
			current.next=null;
		}
		return li;
	}
	public static void display(LinkedList3 li)
	{
		System.out.println();
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
		LinkedList3 li=new LinkedList3();
		li.insert(li,10);
		li.insert(li,20);
		li.insert(li,30);
		li.insert(li,40);
		li.insert(li,50);
		display(li);
		li.delete(li, 50);
		display(li);
	}

}
