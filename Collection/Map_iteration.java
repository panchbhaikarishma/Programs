package Collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_iteration 
{
public static void main(String[] args)
{
	Map <String,String>m1=new HashMap<String,String>();
	m1.put("GTM13", "Karishma");
	m1.put("GTM14", "Suhel");
	m1.put("GTM15", "Guddu");
	m1.put("GTM16", "Sneha");
	System.out.println(m1);
	
	Set<Entry<String,String>> a1 = m1.entrySet();
	Iterator<Entry<String,String>> p1=a1.iterator();
	
	while(p1.hasNext())
	{
		System.out.println(p1.next());
	}
	
	
	
	
	
	
	
	/*
	for(String s1:  m1.keySet())
	{
		System.out.println(s1);
	}
	for(String s2: m1.values())
	{
		System.out.println(s2);
	}
	
	for(  Entry<String, String> S3 :   m1.entrySet())
	{ 
		System.out.println(S3);
	}*/
}
}
