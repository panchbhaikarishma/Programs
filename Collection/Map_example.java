package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map_example
{
public static void main(String[] args) 
{
	Map m1=new HashMap();
	m1.put("GTM13", "Karishma");
	m1.put("GTM14", "Suhel");
	m1.put("GTM15", "Guddu");
	m1.put("GTM16", "Sneha");
	System.out.println(m1);
	
	
	Map m2=new HashMap();
	m2.put("GTM17", "Sahil");
	m2.put("GTM18", "Vishal");
	m2.put("GTM19", "sushant");
	m2.put("GTM20", "shavan");
	System.out.println(m2);
	System.out.println(m2.containsKey("GTM14"));
	

	
	m2.putAll(m1);
	System.out.println(m2);
	boolean a1=m1.equals(m2);
	System.out.println(a1);
	m2.putIfAbsent("GTM21", "Shurya");
	System.out.println(m2);
	m1.clear();
	System.out.println(m1);
	System.out.println(m1.isEmpty());
	
	
	
	
	
	
	
}
}
