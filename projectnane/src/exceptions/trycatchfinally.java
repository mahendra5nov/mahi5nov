package exceptions;

public class trycatchfinally {
	public static void main(String[] args) {
		int a= 80;
		int b= 0;
		int c=0;
		int d[] = {8,7,6,4,3,1};
		try 
		{
			System.out.println("risky code");
			c=a/b;
			// it is a normal flow finally block is always executed
		}
		catch(ArithmeticException e)
		{
			System.out.println("alternative code");
			b= 2;
			c=a/b;
			System.out.println(c);
		}
		
		finally
		{
			System.out.println("finally block excuted");
		}
		
		
	}

}
