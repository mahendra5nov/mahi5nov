package exceptions;

public class basic {
	static void test()
	{
		throw new NullPointerException();
	
	}
	static void demo () 
	{
		throw new ArithmeticException();
	}
	public static void main(String[] agrs)
	{
		int a = 40;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		System.out.println("main method is running");
		
		test();
		demo();
		
	}

}
