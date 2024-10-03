package Pratice1;

public class Palidrome_string 
{
	public static void main(String[] args) 
	{
		String input="malayalam";
		System.out.println("My input is->"+input);
		String output ="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			
		char c1=	input.charAt(i);
		output=output+c1;
			
		}
		System.out.println("My output is->" +output);
		if(input.equals(output)==true)
		{
			System.out.println("It is Palidrome");
		}
		else
		{
			System.out.println("It is not Palidrome");
		}
		
		
		
	}


}
