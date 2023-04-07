package method;

public class argsarithmatic1
{
	public void multiplication(int a,int b)
	{
		int c=a*b;
		 System.out.println("multiplication =" + c);
	}
	public static void  addition()
	{
		int a=30;
		int b=20;
		int c=a+b;
		System.out.println("addition =" + c);
	}
	public static void main(String [] agrs)
	{
		addition();
		argsarithmatic1 x= new argsarithmatic1();
		x.multiplication(55, 12);
		x.multiplication(12, 22);
	}

}
