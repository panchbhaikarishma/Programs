package Viva;

import java.util.Enumeration;
import java.util.Stack;

public class enumeration 
{
public static void main(String[] args) 
{
	Stack s1=new Stack();
	s1.add(100);
	s1.add(20);
	s1.add(30);
	s1.add(50);
	System.out.println(s1);
	Enumeration e1=s1.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
}
}
