package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hasnext {

	public static void main(String[] args) {
		List li=new ArrayList();	
		  li.add(852);
		  li.add("Manish");
		  li.add(true);
		  li.add(1234);
		  li.add(null);
		  li.add(null);
		  System.out.println(li.size());
	Iterator l1=	  li.iterator();
	while(l1.hasNext())
	{
		System.out.println(l1.next());
	}

	}

}
