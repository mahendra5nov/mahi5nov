package logicalprogram;

public class forstar2 
{
	public static void main(String[]args)
	{ int a=1;
		for(int i=1; i<=5; i++ )
		{   
			
			for(int j=5;j>=a; j-- )
			{
				System.out.print("*");
			}
			System.out.println("");
			a++;
		}
	}

}
