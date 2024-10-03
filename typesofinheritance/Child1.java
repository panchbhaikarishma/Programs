package typesofinheritance;
class Grandparent
{
	Grandparent()
	{
		System.out.println(1);
	}
	}
class Parent extends Grandparent
{
	 Parent()
	{
		System.out.println(2);
	}
	}
public class Child1 extends Parent

{
	Child1()
	{
		System.out.println(3);
	}
public static void main(String[] args) 
{
	new Child1();
	
}
}
