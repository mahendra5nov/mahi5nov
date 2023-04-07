package exceptions;

public class multitrycatch {
	public static void main(String[] args) {
		int a= 40;
		int b= 0;
		int c=0;
		int d [] = {24, 34,6,7,53,77,};
		
		System.out.println("before try block code started");
		try
		{
			System.out.println("risky code");
			c=a/b;         //this line is exicute 
			System.out.println(d[6]); // compiler skip this line 
			            // compilar enter only once in try block
			// in any try block we can put only one risky code
		}
		catch(ArithmeticException e)
		{
			b= 2;
			c=a/b;
			System.out.println("alternative code of exception");
			
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("altenative code of array index");
			System.out.println(d[3]);
			System.out.println(x);
		}
		
	
	}
}
