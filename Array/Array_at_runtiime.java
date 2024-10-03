package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_at_runtiime 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	int Rollno[]=new int[4];
	
	for(int i=0;i<4;i++)
	{
	Rollno[i]=s1.nextInt();
	
	}
	System.out.println(Arrays.toString(Rollno));
	
}
}
