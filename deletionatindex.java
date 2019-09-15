package linkedlist;
import java.util.*;
import linkedlist.LinkedList3.Node;

public class LinkedList4 {
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
	public static LinkedList4 insert(LinkedList4 li,int data)
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
	public static LinkedList4 delByIndex(LinkedList4 li,int index)
	{
		Node current=li.head;
		Node prev=null;
		int count=0;
		if(li.head==null)
		{
			System.out.println("No list available");
		}
		else
		{
			while(current.next!=null)
			{
				count++;	
				if(index==0)
				{
					li.head=current.next;
					break;
				}
				else if(count==index)
				{
					prev=current.next.next;
					current.next=prev;
					break;
				}
				else
				{
					current=current.next;
				}
			}
		}
		return li;
	}
	public static void display(LinkedList4 li)
	{
	
		Node current=li.head;
		System.out.println("The LinkedList is as follows: ");
		while(current.next!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList4 li=new LinkedList4();
		System.out.println("Enter the size of the list");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
		li.insert(li,a);
		}
		display(li);
		System.out.println("Enter the index at which you want to delete the node:");
		int index=sc.nextInt();
		System.out.print("After deleting the node at index "+index+", ");
		li.delByIndex(li,index);
		display(li);

	}

}
