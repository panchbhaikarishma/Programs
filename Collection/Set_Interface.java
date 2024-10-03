package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface 
{
public static void main(String[] args) 
{
	Set s1=new HashSet();
	s1.add(145);
	s1.add("Manish");
	s1.add(963);
	s1.add(856);
	s1.add(null);
	s1.add("true");
	s1.add(null);
	
System.out.println(s1);
Iterator a1=s1.iterator();
while(a1.hasNext())
{
	System.out.println(a1.next());
}

	
}
}
