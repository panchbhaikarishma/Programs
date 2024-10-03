package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_behavior 
{
public static void main(String[] args) 
{
	ArrayList a1=new ArrayList();
	a1.add(852);
	a1.add("manish");
	a1.add(null);
	a1.add(null);
	//System.out.println(a1);
	
	
	ListIterator c2=a1.listIterator();
	while(c2.hasNext())
	{
		System.out.println(c2.next());
	}
	
	ListIterator c2=a1.listIterator();
	while(c3.hasPrevious())
	{
		System.out.println(c3.previous());
	}
	
	
	
	
}
}
