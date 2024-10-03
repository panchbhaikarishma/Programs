package Pratice1;//super calling statement
class parent
{
 parent()
 {
	 System.out.println(1);
 }

 }

public class child1_class extends parent
{
	child1_class()
	{
		System.out.println(2);
	}
public static void main(String[] args) 
{
	new child1_class();
	
	
	
}
}
