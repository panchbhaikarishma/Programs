package Array;

import java.util.Arrays;

public class ToChar_Array 
{
public static void main(String[] args) 
{
	String name="manish";
	char c1[]=name.toCharArray();
	System.out.println(Arrays.toString(c1));
	Arrays.sort(c1);
	System.out.println(Arrays.toString(c1));
}
}
