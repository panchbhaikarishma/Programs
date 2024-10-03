package Pratice1;
class GrandParent_class
{
	GrandParent_class()
	{
		System.out.println("1");
	}
	}
class Parent_class extends GrandParent_class
{
	Parent_class()
	{
		super();
		System.out.println("2");
	}
}

public class Child_Class extends Parent_class
{
	Child_Class()
	{
		
		System.out.println("3");
	}
public static void main(String[] args) 
{
	Child_Class c1=new Child_Class();
	
}
}
