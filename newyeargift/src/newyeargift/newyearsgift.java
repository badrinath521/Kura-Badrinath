package newyeargift;
import java.util.*;



interface chocolates
{
	public void numberofchocolates();
}

interface sweets
{
	 public void numberofsweets();
}
class birthday implements chocolates,sweets
{
	int weight,price,n1,n2;
	HashMap<String,Integer> set=new HashMap<String,Integer>();
 public void numberofchocolates()
 {
	 Scanner sc = new Scanner(System.in);
		System.out.print("\n enter number of chocolates:\n");
	
		n1=sc.nextInt();
		System.out.println("\n no of chocolates recieved in the gift are "+n1);
 }
public void numberofsweets()
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("\nenter the number of sweets");
    n2=sc.nextInt();
	System.out.println("\nnumber of Sweets recieved in gift " + n2);
		
 }
 public void calweight()
 {
	 int i1=100;
	 int i2=300;
		weight=n1*i1+n2*i2;
		System.out.println("\nthe total Weight of gifts for both chocolate and sweeet is "+weight+" gms \n");	 
 }
 public void Chocolates() 
 {
      Scanner int1=new Scanner(System.in);
	 Scanner int2=new Scanner(System.in); 
	     
	for(int i=1;i<=n1;i++) {
		System.out.println("enter the name of the  chocolate"+i);
		String name = int2.nextLine();  
		System.out.println("enter the price of the  chocolate"+i);
		int a = int1.nextInt(); 
		dict.put(name,a); 	
	}
	System.out.println(dict);
	
	Map<String,Integer> sortedMap = new TreeMap<String,Integer>(dict);
    System.out.println("THe Alphabetical order of the chocolates in the gift are    : " + sortedMap);
}

public void calcRange(int sortType)
{
	Scanner input=new Scanner(System.in);
	System.out.println("let find the predetermined range:");
	int lowerlimit,higherlimit;
	if(sortType==1)
	{
		System.out.println("enter the lower of the price");
		lowerlimit=input.nextInt();
		System.out.println("enter the higher of the price");
		higherlimit=input.nextInt();
		Set<Map.Entry<String,Integer>> candySet=price.entrySet();
		Iterator<Map.Entry<String,Integer>> candyIterator=candySet.iterator();
		while(candyIterator.hasNext())
		{
			Map.Entry candyElement=(Map.Entry)candyIterator.next();
			int currentprice=(int)candyElement.getValue();
			if(currentprice>=lowerlimit&&currentprice<=higherlimit)
				System.out.println(candyElement.getKey());
		}
	}
	else
	{
		System.out.println("enter the lowerlimit of the weight:");
		lowerlimit=input.nextInt();
		System.out.println("enter the higherlimit of the weight");
		higherlimit=input.nextInt();
		Set<Map.Entry<String,Integer>> candySet=weight.entrySet();
		Iterator<Map.Entry<String,Integer>> candyIterator=birthday.calcRange(int);
		while(candyIterator.hasNext())
		{
			Map.Entry candyElement=(Map.Entry)candyIterator.next();
			int currentweight=(int)candyElement.getValue();
			if(currentweight>=lowerlimit&&currentweight<=higherlimit)
				System.out.println(candyElement.getKey());
		}
	}
}
}


public class newyearsgift {
public static void main(String[] args) {
		
		birthday b= new birthday();
		b.numberofchocolates();
		b.numberofsweets();	
		b.calweight();
		b.Chocolates();
        b.calcRange(2);
}
}