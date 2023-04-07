package polymorphism;

public class practicelodding {
	public void  sum()
	{
		System.out.println( "addition");
	}
	public void sum(int a ,int b)
	{
		System.out.println(a+b);
	}
	public void sum(int c, int d, int z) {
		System.out.println(z= c+d);
	}
	public static void sum(int m ) 
	{
		System.out.println(m);
	}
	public static void main(String[] args) {
		practicelodding x =new practicelodding();
				x.sum(22, 044);
				x.sum(10, 100, 01);
				x.sum();
				 sum(55);
	}
}
