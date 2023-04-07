package exceptions;

public class tryintry {
	public static void main(String[] args) {
		int a= 60;
		int b= 0;
		int c= 0;
		int d[]= {3,4,5,6,7,8};
		try
		{   //outer try for outer catch and inner try for inner catch
			System.out.println("risky code");
			c= a/b;
			
			// try in try r acceptable 
			try 
			{
				System.out.println("inner  try run");
				System.out.println(d[6]);
			}
			catch(ArrayIndexOutOfBoundsException x)
			{
				System.out.println("altenative code of array index");
				System.out.println(d[3]);
			
			}
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
