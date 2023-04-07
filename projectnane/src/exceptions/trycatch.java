package exceptions;

public class trycatch {
	public static void main(String[] args) {
		int a= 60;
		int b= 0;
		int c= 0;
		
		try
		{
			System.out.println("risky code");
			c= a/b;
		}
		catch(ArithmeticException e)
		{
			b= 2;
			c=a/b;
			System.out.println("alternativecode");
			System.out.println(c);
		}
		
		
		
	}

}
