package Array;

import java.util.Arrays;

public class Anagram 
{
public static void main(String[] args)
{
	String name1="arm";
	String name2="ram";
	char c1[]=name1.toCharArray();
	char c2[]=name2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	boolean b1=Arrays.equals(c1, c2);
	System.out.println(b1);
	if(b1==true)
	{
		System.out.println("They are anagram");
	}
	else
	{
		System.out.println("They are not anagram");
	}
}

}
