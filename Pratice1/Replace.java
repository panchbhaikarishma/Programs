package Pratice1;

public class Replace 
{
public static void main(String[] args) 
{
	String name="Manish";
	String s1=name.replace('h','z');
	System.out.println(s1);
	
	String name2="Manish Tiwari";
	String s2=name2.replaceAll("Tiwari","Kumar");
	System.out.println(s2);
	
	
}
}
