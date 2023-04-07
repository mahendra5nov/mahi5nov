package logicalprogram;

public class hwspacelinest1 
	{
	public static void main(String [] agrs)
	{
		int space= 5;
	for(int i=1;i<=5;i++ )
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}

		for(int k=1;k<=5;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
	}
	}
}
