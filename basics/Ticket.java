package basics;

public class Ticket 
{

	public static void main(String[] args) 
	{
		String name="Female";
		int age=13;
		if (name=="Male")
		{
			System.out.println("Free Ticket for Female");
		}
		
		else
		{
			
			if (age<2)
			{
				System.out.println("Free Ticket to below 2");
			}
			else 
			{
				if (age<=12)
				{
					System.out.println("Half Ticket");
				}
				else {
					
					if (age<=60)
					{
						System.out.println("Full Ticket");
					}
					else {
						if(age>60) 
						{
							System.out.println("Half Ticket");
						}
						else
						{
							System.out.println("Person can not travel");
						}
					}
					
				}
			}
			
			
			
			
		}

	}

}
