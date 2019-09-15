package linkedlist;

public class LinkedList1 {
	static Node head;
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
	public static LinkedList1 insert(LinkedList1 li,int data)
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
	public static void display(LinkedList1 li)
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
	public static void main(String args[])
	{
		LinkedList1 li=new LinkedList1();
		li.insert(li,10);
		li.insert(li,20);
		li.insert(li,30);
		li.insert(li,40);
		li.insert(li,50);
		display(li);
	}
}

