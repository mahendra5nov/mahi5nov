package array;

import java.util.Arrays;

public class arrayswapehome {
	 private int a[] = { 12,11,99, 55,33,78};
	public static void main(String [] agrs)
	{
		arrayswapehome m =new arrayswapehome();
		
		for(int i=0;i<=m.a.length-1;i++)
		{
			System.out.print(m.a[i]+" ");

		}
		Arrays.sort(m.a);
		System.out.println();

		for(int i=0;i<=m.a.length-1;i++)
		{
			System.out.print(m.a[i]+" ");

		}
		System.out.println();

		for (int i=m.a.length-1;i>=0;i--)
		{
			System.out.print(m.a[i]+" ");

		}
	}
	

}
