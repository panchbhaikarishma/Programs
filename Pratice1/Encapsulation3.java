package Pratice1;
class Facebook_login
{
	private String un="Panchbhaikarishma@gmail.com";
	
	public String getun()
	{
		return un;
	}
	public void setun(String un)
	{
		this.un=un;
	}

}

public class Encapsulation3 
{
public static void main(String[] args) 
{
	Facebook_login f1=new Facebook_login();
	f1.setun("SuhelRamteke@gmail.com");
	System.out.println(f1.getun());
}
}
