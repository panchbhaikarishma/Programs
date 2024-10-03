package Array;

public class Cheking_alpha_space 
{
public static void main(String[] args) 
{
	int count_of_alphabet=0;
	int count_of_numeric=0;
	int count_of_specialchar=0;
	int count_of_space=0;
	
	String a="manish kumar 7789654156";
	char[] c1=a.toCharArray();
	for(int i=0;i<a.length();i++)
	{
	Boolean b1= Character.isLetter(c1[i]);
	if(b1==true)
	{
		count_of_alphabet++;
	}
	}
	System.out.println("The number of alphabets are->"+count_of_alphabet);
	//******************************************
	
	
	for(int i=0;i<a.length();i++)
	{
	Boolean b1= Character.isDigit(c1[i]);
	if(b1==true)
	{
		count_of_numeric++;
	}
	}
	System.out.println("The number of numerics are->"+count_of_numeric);
	///*******************************************************
	

	for(int i=0;i<a.length();i++)
	{
	Boolean b1= Character.isWhitespace(c1[i]);
	if(b1==true)
	{
		count_of_space++;
	}
	}
	System.out.println("The number of space are->"+count_of_space);
	//*******************************************

	/*for(int i=0;i<a.length();i++)
	{
	Boolean b1= Character.
	if(b1==true)
	{
		count_of_space++;
	}
	}
	System.out.println("The number of alphabets are->"+count_of_space);*/
}
}
