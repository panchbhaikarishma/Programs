package Pratice1;

public class Array_notocheck 
{
public static void main(String[] args) 
{
	int rollno[]=new int[5];
	rollno[0]=36;
	rollno[1]=63;
	rollno[2]=52;
	rollno[3]=65;
	rollno[4]=34;
	int notocheck=34;
	
	for(int i=0;i<5;i++)
	{
	if( rollno[i]==34)
	{
		System.out.println("It is part of Array "+notocheck);
		System.out.println("It is ata index of "+i);
	}
	}
}
}
