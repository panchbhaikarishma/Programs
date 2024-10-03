package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_iteration2 
{
public static void main(String[] args)
{
	Map<Integer,String> m1= new HashMap();
	m1.put(101,"Karishma");
	m1.put(102, "Suhel");
	m1.put(103, "Sneha");
	m1.put(104, "Harsh");
	System.out.println(m1);
	
	for(Entry<Integer,String> e1: m1.entrySet())
	{ 
		System.out.println(e1);
	}
	
	for(String s2: m1.values())
	{
		System.out.println(s2);
	}
	
	for(Integer s3: m1.keySet())
	{ 
		System.out.println(s3);
	}
	Set<Entry<Integer,String>> q1= m1.entrySet();
	Iterator<Entry<Integer,String>> d1=q1.iterator();
	while(d1.hasNext())
	{
		System.out.println(d1.next());
	}
}
}
