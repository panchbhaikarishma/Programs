package basics;

public class String_reverse
{
public static void main(String[] args) 
{
	String input="karishma";
			String output="";
			for(int i=input.length()-1;i>=0;i--)
			{
				char c1=input.charAt(i);
				System.out.print(c1);
			}
}
}
