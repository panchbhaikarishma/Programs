package Pratice1;

import java.util.Arrays;

public class Array_value_checking 
{
public static void main(String[] args) 
{
	int rollno[]=new int[4];
	rollno[0]=45;
	rollno[1]=63;
	rollno[2]=34;
	rollno[3]=63;
	int notocheck=34;
	for(int i=0;i<4;i++)
	{
		if(notocheck==rollno[i])
		{
			System.out.println("The given number-> " + notocheck +" is a part of array");
			System.out.println("The given number-> " + notocheck +" in the index " +i);
		
		}
		
		
		
	}
	}

}
 
