package typesofinheritance;
interface Facebook
{
	void Login_fb();
	void Logout_fb();

	} 
interface Google
{
	void Login_google();
	void Logout_google();
}

interface Gmail
{
	void Login_email();
	void Logout_email();
	}

public class Grotechmind_website implements Gmail,Google,Facebook
{

	@Override
	public void Login_fb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Logout_fb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Login_google() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Logout_google() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Login_email() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Logout_email() {
		// TODO Auto-generated method stub
		
	}

}
