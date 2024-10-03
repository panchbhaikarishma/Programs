package Array;

import java.util.Arrays;

public class Coping_arrayin_another
{
public static void main(String[] args) 
{
	int rollno1[]=new int[4];
	rollno1[0]=74;
	rollno1[1]=74;
	rollno1[2]=74;
	rollno1[3]=74;
	int rollno2[]=new int[4];
	for(int i=0;i<4;i++)
	{
		rollno2[i]=rollno1[i];
	}
	System.out.println(Arrays.toString(rollno1));
	System.out.println(Arrays.toString(rollno2));
	
}
}
