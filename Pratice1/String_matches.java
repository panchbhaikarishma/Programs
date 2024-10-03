package Pratice1;

public class String_matches 
{
public static void main(String[] args) 
{
	String name="School";
//	Boolean b2=name.matches("(.*)l"); // Multicharacter search
//	System.out.println(b2);
	
	boolean b2=name.matches("S(.*)");
	System.out.println(b2);
	
	boolean b3=name.matches("(.*)o(.*)");
	System.out.println(b3);
	
	boolean b4=name.matches("......");
	System.out.println(b4);
	
	
}
}
