package polymorphism;

public class riding2 extends riding1
{
	public void thrusday()
	{
		System.out.println(" yesterday was  thrusday");
	}
	public static void main(String[] agrs)
	{
		riding2 r =new riding2();
		r.thrusday();

		riding1 n =new riding2();
		n.thrusday();
	}
}
