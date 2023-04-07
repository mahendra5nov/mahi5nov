package constrctor;

public class multiconstructor 
{
	int a;
	int b;
	int m;
	String name;
	String velocity;
	multiconstructor(){
		// user define constructor without parameter
		a=78;
		b=60;
		
	}
	multiconstructor(int c ,int d)
	{
		a=c;
		d=b;
	}
	multiconstructor(int c, int d ,int i)
	{// user define constructor with parameter
		a=c;
		b=d;
		m=i;
	}
		public void addition()
		{// non static method 
			System.out.println(m+a+b);	
		}
		public static void main (String [] agrs)
		{
		multiconstructor x =new multiconstructor();
		x.addition();
		x.addition();
		multiconstructor y= new multiconstructor(30,23,23);
		y.addition();
		multiconstructor z= new multiconstructor(35,44);
		z.addition();
		
		}
}
