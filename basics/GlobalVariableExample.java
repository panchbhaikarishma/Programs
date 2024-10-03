package basics;
public class GlobalVariableExample 
{
	String name="Ram";
	static double salary=1504.12;
public static void main(String[] args) 
{
	
	GlobalVariableExample g1=new GlobalVariableExample();
	g1.name="Ramya Varma";
	g1.salary=456325;
	System.out.println(g1.name);
	System.out.println(g1.salary);
	
}
}
