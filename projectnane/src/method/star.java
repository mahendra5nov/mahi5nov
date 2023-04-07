package method;

public class star {
	static void test()
	{
		int space=3;
		int star=1;
	for (int i=1;i<=3;i++ ) 
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
		star=star+2;
	}
	
	}
	public static void main(String [] agrs)
	{
		test();
		test();
		test();
		System.out.println();
	}

}
