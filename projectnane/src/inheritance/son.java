package inheritance;

public class son extends father{
	public static void memo()
	{
		System.out.println(" memo son");
	}
	public void some()
	{
		System.out.println(" some son");
	}
	public static void main (String [] agrs)
	{
		son x = new son();
		x.test();
		x.demo();
		x.some();
		x.memo();
	}
}
