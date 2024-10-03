package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_char_String 
{
public static void main(String[] args) 
{
	String name1[]=new String[3];
	name1[0]="Karishma";
	name1[1]="Suhel";
	name1[2]="Sneha";
	String name2[]=new String[3];
	name2[0]="Karishma";
	name2[1]="Suhel";
	name2[2]="Prerna";
	char name3[]=new char[3];
	name3[0]='K';
	name3[1]='S';
	name3[2]='R';
	char name4[]=new char[3];
	name4[0]='K';
	name4[1]='S';
	name4[2]='R';
	boolean b1=Arrays.equals(name1, name2);
	boolean b2=Arrays.equals(name3, name4);
	System.out.println(b1);
	System.out.println(b2);
	
	
	
}
}
