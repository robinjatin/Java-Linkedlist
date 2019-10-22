import java.util.*;
public class Circular
{
	static Node head;
	static int count=0;
	static int count1=0;
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
	public static Circular insr(Circular c,int d)
	{
		System.out.println("Element or data "+d+ " has been inserted into the list");
		++count;
		Node new_node=new Node(d);
		if(c.head==null)
		{
			c.head=new_node;
		}
		else
		{
			Node last=c.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return c;
	}
	public static void conv(Circular c)
	{
		System.out.println("Converting linked list to circular linked list");
		Node a=c.head;
		while(a.next!=null)
		{
			a=a.next;
		}
		a.next=c.head;
	}
	public static void display(Circular c)
	{
		System.out.println("The linked list is ");
		Node as=c.head;
		while(as!=null)
		{
			System.out.println(as.data);
			as=as.next;
		}
	}
	public static void break1(Circular c)
	{
		
		Node xy=c.head;
		Node yz=null;
		while(xy.next!=null)
		{
			if(count==count1)
			{
				System.out.println("Breaking the "+yz.data+ " and "+xy.data+ " link in the circular linked list");

				break;
			}
			else
			{
				++count1;
				yz=xy;
				xy=xy.next;
			}
		}
		yz.next=null;
	}		
	public static void main(String []args)
	{
		Circular c=new Circular();
		c.insr(c,1);
		c.insr(c,8);
		c.insr(c,3);
		c.insr(c,4);
		c.insr(c,5);
		c.display(c);
		c.conv(c);
		c.break1(c);
		c.display(c);
	}
}	
