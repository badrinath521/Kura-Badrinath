import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
 class Linkedlist
{
	  String s;
	   List l1=new LinkedList();
	   Scanner sc=new Scanner(System.in);
		
	void initiallist()
	{
		System.out.print("the initial elements in the list are\n");
		l1.add("123");
		l1.add("badri");
		l1.add("231");
		l1.add("raman");
		l1.add("124");
		l1.add("agar");
		l1.add("1300");
		l1.add("1484");
		l1.add("australia");
		l1.add("1534");
		
	}
	void push( )
	{
		System.out.println("enter the element you want to add to the list");
		s=sc.next();
                l1.add(s);	;
        
	}
	void remove()
	{
		
		System.out.println("enter the element you want to delete from the list");
		s=sc.next();
		l1.remove(s);
	}
	void print() 
	{
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			
			System.out.println(i1.next());
		}
		System.out.println("-.-.-.-----");

		System.out.println(l1);
	}
	void fetch()
	{
		System.out.println("enter the index of element you want to fetch ");
		int s=sc.nextInt();
		System.out.println(l1.get(s));
	}
	void selection()
	{
		int choice;
		int ch;
		do
		{
		System.out.println("\n enter your choice of operation\n1.add \n2.delete\n3.fetch\n4.print\n");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:push();
		       System.out.println("addition sucessful");
		       break;
		case 2:remove();
		       break;
		case 3:fetch();
		       break;
		case 4:print();
		       break;
		default:System.out.println("please choose correct option");
		        break;
		       
		}
		System.out.println("Do you want to do any other operation\n 1.yes\n2.no");
		ch=sc.nextInt();
	}while(ch==1);
	}
	
}
