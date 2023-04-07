package abstracts;

public class callabc extends abc
{
	public void rest()
	{
		System.out.println("implemented method");
	}
	public void test()
	{
		System.out.println("test method reimplemented");
	}
	public static void main(String []agrs)
	{
		callabc x =new callabc();
		x.rest();
		x.test();
		 abc y = new callabc();
		 y.rest();
		 y.test();
	}
}
