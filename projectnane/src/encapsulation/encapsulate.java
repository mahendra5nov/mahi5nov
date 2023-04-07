package encapsulation;

public class encapsulate 
{
	private int a =25;
	private int b = 34;
	encapsulate()
	{
		a=20;
		b=55;
	}
	encapsulate( int c,int d)
	{
		a=c;
		b=d;
	}
	 public void demo ()
	 {
		 System.out.println(a+b);
	 }
	 public static void main(String[] agrs)
	 {
		 encapsulate x = new encapsulate();
		 x.demo();
	 }
}
