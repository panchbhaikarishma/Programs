package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Map_Interface 
{
public static void main(String[] args) 
{
		Map<Integer,String> m1=			new HashMap<Integer,String>();
		m1.put(245212, "Ataullah");
		m1.put(321452, "Bhavani");
		m1.put(547852, "Arpita");
		m1.put(785412, "Dhanraj");
		
		Set<Entry<Integer,String>>	s2=				m1.entrySet();
		Iterator<Entry<Integer,String>> i1=		s2.iterator();
		
		while(i1.hasNext())
		{
			
			System.out.println(i1.next());
		}
		
		
		
		
		
		
		
		
		/*
			for(Entry<Integer,String> e1:         m1.entrySet())
			{
				System.out.println(e1);
			}
			
			for(String s2:  m1.values())
			{
				System.out.println(s2);
			}
	
			for(Integer s2:  m1.keySet())
			{
				System.out.println(s2);
			}
						
*/


}
}
