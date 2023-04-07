package logicalprogram;

public class starspaceR 
{
	public static void main(String [] agrs)
	{
		int space=0;
		int star=4;
		for(int i=1;i<=4; i++)
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
			star--;
			space++;
		}
		
	}

}
