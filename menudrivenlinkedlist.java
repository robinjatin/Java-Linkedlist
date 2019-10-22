import java.util.*;
public class Linkedlist5 {
	static Node head;
	public static Scanner sc=new Scanner(System.in);
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
	public static Linkedlist5 insert(Linkedlist5 li,int data)
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
	public static Linkedlist5 insertAtBeg(Linkedlist5 li,int data)
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
	public static Linkedlist5 delete(Linkedlist5 li,int index)
	{
		Node current=li.head,prev=null;
		int count=0;
		if(li.head==null)
		{
			System.out.println("List is empty");
			return li;
		}
		else if(index==0)
		{
			li.head=current.next;
		}
		else
		{
			while(current.next!=null)
			{
				count++;
				if(count==index)
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
	public static Linkedlist5 deleteAtEnd(Linkedlist5 li)
	{
		
		if(li.head==null)
		{
			System.out.println("List is empty");
			return li;
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
	public static void reverse(Linkedlist5 li)
	{
	if(li.head==null)
	System.out.println("Linked list is empty");
	else
	{
    Node prev = null; 
    Node current = li.head; 
    Node next = null; 
    while (current != null) { 
        next = current.next; 
        current.next = prev; 
        prev = current; 
        current = next; 
    } 
    li.head= prev; 
	}
	}
	public static void display(Linkedlist5 li)
	{
		Node current=li.head;
		if(li.head==null)
		{
			System.out.println("No list is present");
		}
		else
		{
			System.out.println("The list is: ");
			while(current.next!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println(current.data);
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Linkedlist5 li=new Linkedlist5();
		String s=new String();
		String z=new String();
		System.out.println("Menulist: Insert, Delete, Display");
		while(s.equalsIgnoreCase("no")==false){	
			int casee;
			System.out.println("Enter the case, 1 for Insertion, 2 for delete, 3 for reversing & 4 for displaying ");
			try {
			 casee=sc.nextInt();
		switch(casee)
		{
		case 1:
		{
			System.out.println("Do you want to add at the beginning? Enter 1 for yes 2 for no");
			try {
			int ze=sc.nextInt();
			switch(ze)
			{
				case 1:
			{
				System.out.println("Enter the element to add at the beginning: ");
				int add=sc.nextInt();
				li.insertAtBeg(li,add);
				break;
			}
				case 2:
			{
			System.out.println("Insertion of data, enter size: ");
			int size=sc.nextInt();
			System.out.println("Enter the elements");
			for(int i=0;i<size;i++)
			{
				int dat=sc.nextInt();
				li.insert(li, dat);
			}
			break;
			}
				default:
					System.out.println("Invalid input");
			}}
			catch(Exception e)
			{
				System.out.println("Invalid data type");
			} 
			break;
		}
		case 2:
		{
			System.out.println("Do you want to delete at the end? Enter 1 for yes and 2 for no");
			
			try {
			int ze=sc.nextInt();
			switch(ze)
			{
				case 1:
			{
				deleteAtEnd(li);
				break;
			}
				case 2:
				{
			System.out.println("Deletion of data, enter the index at which you want to delete");
			
			int ind=sc.nextInt();
			li.delete(li,ind);
			break;
				}
				default:
				{
					System.out.println("Invalid input");
				}
				}
			}
			catch(NullPointerException e)
			{
				System.out.println("Null point exception arised, enter more elements in the list");
			}
			catch(Exception e)
			{
				System.out.println("Invalid datatype");
			}
			break;
		}
		case 3:
		{
			li.reverse(li);
			break;
		}
		case 4:
		{
			li.display(li);
			break;
		}
		default:
		{
			System.out.println("Wrong input of case");
		}
		}		
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid datatype of input");
			
		}
		catch(NullPointerException e)
			{
				System.out.println("List doesn't exist");
			}
			System.out.println("Do you want to continue? Enter yes or no");
			sc.nextLine();
			s=sc.next();
			if(s.equalsIgnoreCase("no")||s.equalsIgnoreCase("n"))
			{
				break;
			}
			else if(s.equalsIgnoreCase("yes")||s.equalsIgnoreCase("y"))
			{
			continue;
			}
			else
			{
				System.out.println("Invalid datatype");
			}
			
		}		
		}
}
