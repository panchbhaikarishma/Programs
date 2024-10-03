package Collection;

import java.util.Enumeration;
import java.util.Stack;

public class Stack_class 
{
public static void main(String[] args) 
{
	Stack s1=new Stack();
	s1.add(100);
	s1.add(50);
	s1.add(23);
	s1.add("karishma");
	s1.add("Suhel");
	System.out.println(s1);
	Enumeration s2=s1.elements();
	while(s2.hasMoreElements())
	{
		System.out.println(s2.nextElement());
	}
	
}
}
