package nestedif;

public class nestedif 
{
	public static void main(String[] arge) 
	{
		String usname="mahi24";
		String pass="ma@567";
		if (usname=="mahi24") 
		{
			System.out.println("user name correct");
			if (pass=="ma@567") 
			{
				System.out.println("password is correct");
				System.out.println("login is sucessful");
			}
			else 
			{
				System.out.println("incorrect password");
				System.out.println("login unsucessful");
			}
		}
			else 
			{
				System.out.println("incorrect usernsme");
			}
		
			
		}
		
	}


