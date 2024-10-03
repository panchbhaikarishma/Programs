package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Interface 
{
public static void main(String[] args) 
{
	Queue q1=new PriorityQueue();
	q1.add(100);
	q1.add(20);
	q1.add(30);
	q1.add(50);
	q1.add("Karishma");
	System.out.println(q1);
	Iterator q2=q1.iterator();
	while(q2.hasNext())
	{
		System.out.println(q2.next());
	}
	
	
	
	
	
	
}
}
