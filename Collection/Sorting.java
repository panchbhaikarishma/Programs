package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Sorting 
{
public static void main(String[] args) 
{
	LinkedList li=new LinkedList();
	li.add(752);
	li.add(852);
	li.add(582);
	System.out.println("Before sort-> "+li);
	Collections.sort(li);
	System.out.println("After sort->"+li);
}
}
