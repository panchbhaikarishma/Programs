package Array;

import java.util.Arrays;

public class Anagram3 
{
public static void main(String[] args) 
{
	String name1="Suhel";
	String name2="Karishma";
	char[] c1=name1.toCharArray();
	char[]c2=name2.toCharArray();
	System.out.println(c1);
	System.out.println(c2);
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
}
}
