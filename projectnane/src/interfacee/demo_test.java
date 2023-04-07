package interfacee;

public class demo_test implements demo {
	public void shop()
	{
		System.out.println("shop closed");
		
	}
	public void home()
	{
		System.out.println(" sweet home");
	}
	public static void main(String [] agrs)
	{
		demo_test m = new demo_test();
		m.home();
		m.shop();
		
	}

}
