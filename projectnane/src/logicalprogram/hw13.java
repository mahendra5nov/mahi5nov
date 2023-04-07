package logicalprogram;

public class hw13 
{
	public static void main(String[] agrs)
	{
		int space=0;
		int star=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if (i<=4)
			{
				space++;
				star--;
			}
			else
			{
				space--;
				star++;
			}
			System.out.println();
		}
	}
}
