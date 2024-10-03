package basics;
class Google
{
	void Login()
	{
		System.out.println("Login with phone number");
	}
	
	}

public class Super_Keyword extends Google
{
	void Login() 
	{
		System.out.println("Login with emailid");
		super.Login();
	}


public static void main(String[] args) 
{
	Super_Keyword n1=new Super_Keyword();
	n1.Login();
}
}
