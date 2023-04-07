package logicalprogram;

public class hollowdimond
{
	public static void main(String[] agrs) {
	int n=4;
	int s=4;
	
	
	for(int i=1;i<=5;i++)
	{
		//for (int j=1;j<=s;j++
		//{
			//System.out.print(" ");
			
		//}
		for (int k=1;k<=n;k++) 
		{
			if(k==1||k==3||k==5)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		s--;
		n++;
	}

}
}