package java8.task.java8.lambadasandstreams;

import java.util.*;
interface Palindrome
{
  List<String> palindromeList(List<String> a);
}

class StringParser
{
public static List<String> findPalindrome(List<String> l)
{
List<String> a=l;
List<String> resultlist=new ArrayList<String>();
for(int i=0;i<a.size();i++)
{
String s=a.get(i);
String reverse=new StringBuilder(s).reverse().toString();
if(s.equals(reverse))
{
resultlist.add(s);
}
else
{
a.remove(i);
}
}
return resultlist;
}
}

class Printer
{
public void print(List<String> a,Palindrome p)
{
a = p.palindromeList(a);
System.out.println("Palindromes In List Area :"+a);
}
}

public class Findpalindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
List<String> a1=new ArrayList<String>();
System.out.println("Enter the Size Of List");
int n =sc.nextInt();
System.out.println("Enter List Of Strings");
for(int i=0;i<n;i++)
{
a1.add(new Scanner(System.in).next());
}
Printer mp=new Printer();
mp.print(a1,(StringParser::findPalindrome));
sc.close();
}
}
