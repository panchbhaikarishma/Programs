package Encapsulation;
class Amazon_Login
{
	private String un="contactgrotectmind@gmail.com";
	private int pwd=777482;
	
	public int getPwd() 
	{
		return pwd;
	}
	public void setPwd(int pwd) 
	{
		this.pwd = pwd;
	}
	public String getun()//getter method
	{
		return un;
	}
	public void setun(String un)//setter method
	{
		this.un=un;
	}
}

public class Encapsulation_program 


{
public static void main(String[] args) 
{
	Amazon_Login a1=new Amazon_Login();
	a1.setun("panchbhaikarishma@gmail.com");
	System.out.println(a1.getun());
	a1.setPwd(774820964);
	System.out.println(a1.getPwd());
}
}
