package Array;

import java.util.Arrays;

public class Check_value 
{
public static void main(String[] args) 
{
	int rollno[]=new int [4];
	rollno[0]=12;
	rollno[1]=13;
	rollno[2]=34;
	rollno[3]=14;
	int notocheck=34;
	for(int i=0;i<4;i++)
	{
	if(notocheck==rollno[i])
	{
		System.out.println("The given number "+notocheck +" is a part of array");
		System.out.println("The given number "+notocheck +"  and had a index of " +i);
	}
	
	
			
}
}
}
