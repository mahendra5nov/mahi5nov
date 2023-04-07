package logicachw;

public class numberspacenumber {
	public static void main(String []args)
	{
		int n=1;
		int space = 8;
		int b;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			for (int k=1;k<=space;k++)
			{
				System.out.print(" ");
				//space = space-2;
			}
			for(int m=1;m<=n;m++)
			{
				//if(i=b)
				//{
				System.out.print(m);
				//b--;
				//}
			}
			System.out.println();
			space = space-2;
			n++;
			//b--;

		}
	}

}
