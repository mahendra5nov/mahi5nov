package array;

public class arrayswape {
	public static void main (String [] agrs)
	{
		int a[] = {11,22,33,44};
		for (int i=0;i<=a.length-1;i++) 
		{
			System.out.println(a[i]);
			}
		System.out.println("***** array swapping******");
		for(int i=0;i<a.length/2;i++)
		{
		int c=a[i];//a[0]=11
		
		a[i] = a[(a.length-1)-i];
			//a[0]=a[(4-1)-0]==>a[0]=a[3]==>44
		
		a[(a.length-1)-i]=c;
		
		}
		//a[0]=a[3]  last index -0 
		  // a[1]=a[2] last index -1
		
		//System.out.println();

		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
