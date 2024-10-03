package String;

public class String_functions 
{
public static void main(String[] args) 
{
	String name="    Manish are you mad    ";
	int size=name.length();//size of string
	System.out.println(size);
	System.out.println(name.toLowerCase());// Lower case
	System.out.println(name.toUpperCase());//Upper case
	
	System.out.println(name.trim());//trim function remove space at of beggining and ending of string
  
	String name1="I am Yamuna";
	System.out.println(name1.substring(2));
	System.out.println(name1.substring(2, 4));
	
	String name2="Manish Tiwari";
	boolean b1=name2.contains("Tiwari");
	System.out.println(b1);
	
	String name3="School";
	boolean a1=name3.matches("(.*)a");
	System.out.println(a1);
	String name4="nisha";
	boolean b2=name4.matches("(.*)a(.*)") ;
	System.out.println(b2);
	
	


}
}
