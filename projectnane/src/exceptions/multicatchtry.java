package exceptions;

public class multicatchtry {
	public static void main(String[] args) {
		int a = 40;
		int b =0 ;
		int c= 0;
		int d[] = {3,5,7,4,9, 8 };
		try 
		{
			System.out.println("risky code");
			//c= a/b;
			System.out.println(d[6]);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("first catch executed");
			b= 5;
			c=a/b;
			System.out.println(c);
		}
		catch (ArrayIndexOutOfBoundsException f)
		{
			System.out.println("second catch executed");
			System.out.println(d[3]);
			
			try 
			{
				System.out.println(" inner risky code");
				b=0;
				c= a/b;    //it will be work when outer try block found exception 
			}
			catch(ArithmeticException e) 
			{
				System.out.println("inner catch executed");
				b= 4;
				c=a/b;
				System.out.println(c);
			}
			
		}
	}

}
