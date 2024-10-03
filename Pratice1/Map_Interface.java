package Pratice1;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface 
{
public static void main(String[] args) 
{
  Map<Integer,String>m1=new HashMap<Integer,String>();
  m1.put(1,"Karishma");
  m1.put(2,"Suhel");
  m1.put(3,"Sneha");
  m1.put(4,"Guddu");
  System.out.println(m1);
  
  Map<Integer,String>m2=new HashMap<Integer,String>();
  m2.put(9,"Shravan");
  m2.put(6,"Harsh");
  m2.put(8,"Chetan");
  m2.putAll(m1);
  System.out.println(m2);
  
	
}
}
