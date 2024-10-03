package Pratice1;
class Amazon_class
{
	private String un="Panchbhaikarishma@gmail.com";
	public String getun()//get the method
	{
		return un;
		
	}
	public void setun(String un)//set the method
	{
		
		this.un=un;
	}

}

public class Encapsulation 
{
public static void main(String[] args) 
{
	Amazon_class a1=new Amazon_class();
	a1.setun("Monika@gmail.com");
	a1.getun();
}
}
