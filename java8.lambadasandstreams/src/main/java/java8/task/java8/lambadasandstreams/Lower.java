package java8.task.java8.lambadasandstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class Lower{

	public static void main(String[] args)
	{
		String a;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the list size");
		n=sc.nextInt();
		List<String> list=new ArrayList<String>();
		System.out.print("enter"+n+"words");
		for(int i=0;i<=n;i++)
		{
			a=sc.nextLine();
			list.add(a);
		}
		List<String> b=list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		System.out.print("the words that start with a are"+b);
       sc.close();
	}

}

