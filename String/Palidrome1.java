package String;

public class Palidrome1 
{
public static void main(String[] args) 
{
	String input="Karishma";
	System.out.println("My input is->"+input);
	String output="";
	for(int i=input.length()-1;i>=0;i--)
	{
	char c1=	input.charAt(i);
	output=output+c1;
	
	}
	System.out.println("My output is->"+output);
	if(input.matches(output)==true)
	{
		System.out.println("It is palidrome");
	}
	else
	{
		System.out.println("It is not palidrome");
	}
	
}
}
