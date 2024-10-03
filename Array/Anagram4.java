package Array;

import java.util.Arrays;

public class Anagram4 
{
public static void main(String[] args)
{
	String name1="Karishma";
	String name2="suhel";
	char [] c1=name1.toCharArray();
	char [] c2=name2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	boolean b1=Arrays.equals(c1, c2);
	System.out.println(b1);
	if(b1==true)
	{
		System.out.println("It is anagram");
	}
	else
	{
		System.out.println("It is  not anagram");
		
	}
	}
	
	

}
