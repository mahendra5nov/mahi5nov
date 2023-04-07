package logicachw;

public class s1_15_15_1 {
	public static void main (String []agrs)
	{
		int n=2;
		int a=1;
		for (int i=1;i<=10;i++)
		{
			for(int j=1; j<=n;j++)
			{
				
				System.out.print(a);
				if (i<5)
				{
					a++;
					
				}
				else
				{
					a--;
					
				}
			}
			System.out.println();
			if (i<5)
			{
				n++;
			}
			else
			{
				n--;
			}
		}
	}

}
