package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator 
{
public static void main(String[] args) 
{
	List L1=new ArrayList<Integer>();
	L1.add(852);
	L1.add(965);
	L1.add(456);
	L1.add(693);
ListIterator a1=	L1.listIterator(0);

	while(a1.hasNext())
{
	System.out.println(a1.next());
	}
	System.out.println("*****************");
while(a1.hasPrevious())
{
	System.out.println(a1.previous());
}
}
}
