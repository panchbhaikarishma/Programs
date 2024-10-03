package Array;

import java.util.Arrays;

public class Array_equals 
{
public static void main(String[] args) 
{
	int Student_id_1[]=new int[4];
	Student_id_1[0]=78;
	Student_id_1[1]=74;
	Student_id_1[2]=73;
	Student_id_1[3]=72;
	int Student_id_2[]=new int[4];
	Student_id_2[0]=78;
	Student_id_2[1]=74;
	Student_id_2[2]=73;
	Student_id_2[3]=72;
	boolean b1=Arrays.equals(Student_id_1, Student_id_2);
	System.out.println(b1);
	}
}
