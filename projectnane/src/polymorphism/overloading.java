package polymorphism;

public class overloading 
{
	public  void addition(int a, int b)
	{
		System.out.println(a+b);
		
	}
	public void addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main (String []agrs)
	{
		overloading s = new overloading();
		s.addition(55, 44);
		s.addition(23, 32, 56);
	}
}
