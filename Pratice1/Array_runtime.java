package Pratice1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_runtime 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	int rollno[]=new int[4]	;
	for(int i=0;i<4;i++)
	{
	rollno[i] =	s1.nextInt();
	}

	System.out.println(Arrays.toString(rollno));
	
}
}
