package Viva;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist_list 
{
public static void main(String[] args) 
{
	List l1=new LinkedList();
	l1.add(100);
	l1.add(null);
	l1.add("Karishma");
	
	List l2=new LinkedList();
	l2.add(100);
	l2.add(50);
	l2.addAll(l1);
	System.out.println(l2);
	
	boolean b1=l2.equals(l1);
	System.out.println(b1);
	
	System.out.println(l1.get(0));
	
	
	
			
}
}
