package basics;
class Grand_parent
{
	Grand_parent(String a)
	{
		System.out.println("1");
	}
}
class Parent_Class extends Grand_parent
{
	Parent_Class()
	{
		super("MKT");
		System.out.println("2");
	}
}
public class Child_Class extends Parent_Class
{ 
	Child_Class()
	{
		System.out.println("3");
	}
public static void main(String[] args) 
{
	new Child_Class();
}
}
