package rikamya_medhod;

public class prime_number {
	public static void main(String[] args) {
		int n =1;
		int a;
		
		
		for(int m= 1;m<=50 ;m++)
		{
			int count=0;

		for (int i=2;i<n;i++)
		{
		a=n%i;
		if (a==0)
		{
			count= count +1;
			}
		}
		
		
		if(count> 0)
		{
			//System.out.println(n+"is not a prime number");
		}
		else
		{
			System.out.println(n+" is a prime");
		}
		
		n++;
		
	}}
}
