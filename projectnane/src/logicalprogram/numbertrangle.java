package logicalprogram;

public class numbertrangle
{
	public static void main (String [] agrs)
	{
		int m=1;
		int space=4;
		for (int i=1;i<=5;i++)
		{
			for( int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=m;k++)
			{
				System.out.print(" "+i);	
			}
			System.out.println();
			m++;
			space--;
			
		}
	}

}
