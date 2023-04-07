package interfacee;

public interface demo
{//   default is use as a keyword not specifere
	public static void memo()
	{
		System.out.println("memo is on");
	}
	
	public default void shop()
	{
		System.out.println("shop is open");
	}
	public void home();
	
}
