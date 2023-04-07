package polymorphism;

public class overloadinstatic 
{
	public static void addition(int a, int b)
	{
		System.out.println(a+b);
		
	}
	static public  void addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main (String []agrs)
	{
		overloadinstatic.addition(23, 22);
		overloadinstatic.addition(12,23, 66);//calling with class name due to static method
	}
}
