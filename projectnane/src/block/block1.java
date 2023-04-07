package block;

public class block1 
{
	{
		System.out.println("non static block is running");
	}
	public static void main (String []agrs)
	{
		
		System.out.println("main method is running");
		block1 x=new block1();
	}
	static 
	{
	System.out.println(" static block is running");
	}

}