package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_iteration3 
{
public static void main(String[] args)
{
	Map<Integer,String> m1=new HashMap<Integer,String>();
	m1.put(12,"Karishma");
	m1.put(13,"Suhel");
	m1.put(14,"Pawan");
	m1.put(15,"Sahil");
	System.out.println(m1);
	
	Set<Entry<Integer,String>> s4= m1.entrySet();
	Iterator s5=s4.iterator();
	while(s5.hasNext())
	{
		System.out.println(s5.next());
	}
	
	for(Integer I1: m1.keySet())
	{
		System.out.println(I1);
	}
	for(String s1:m1.values())
	{
		System.out.println(s1);
	}
	
	for( Entry<Integer,String> s2:m1.entrySet())
	{
		System.out.println(s2);
	}
	
	
}
}
