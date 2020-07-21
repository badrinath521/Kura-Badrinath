package java8.task.java8.lambadasandstreams;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class average
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the size of list:");
		int size=sc.nextInt();
		ArrayList<Integer> values=new ArrayList<Integer>();
		System.out.println("Enter "+size+" numbers:");
		for(int i=0;i<size;i++)
		{
			int number=sc.nextInt();
			values.add(number);
			
		}
		values.stream().mapToInt(x->x).average().ifPresent(avg -> System.out.println("Average Of Numbers is"+" "+ avg));
      sc.close();
	}
}
