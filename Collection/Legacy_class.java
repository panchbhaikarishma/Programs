package Collection;

import java.util.Enumeration;
import java.util.Stack;

public class Legacy_class 
{
public static void main(String[] args) 
{
	Stack s1=new Stack();
	s1.add(1230);
	s1.add(45);
	s1.add(56);
	s1.add(74);
	s1.add(78);
	System.out.println(s1);
	Enumeration b1=s1.elements();
	while(b1.hasMoreElements())
	{
		System.out.println(b1.nextElement());
	}
}
}
