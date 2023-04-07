package array;

import java.util.Arrays;

public class ascdes {
	public static void main (String []agrs )
	{
		int m[] = { 78,11,22,67,43,55};
		System.out.println("*************all array**************");
		for ( int i=0;i<=m.length -1;i++)
		{
			System.out. println(m[i]);
		}
		Arrays.sort( m);
		System.out.println("*************all array accending**************");
		for (int i=0;i<=m.length-1;i++)
		{
			System.out. println(m[i]);
		}
		System.out.println("*************all array decending**************");
		for (int i= m.length-1;i>=0;i--)
		{
			System.out. println(m[i]);

		}
		
	}

}
