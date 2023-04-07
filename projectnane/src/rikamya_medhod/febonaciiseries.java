package rikamya_medhod;

public class febonaciiseries {
	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21 34 
		int a =0;
		int b= 1;
		int c;
		int length = 20;
		System.out.print(a+" "+b);

		for (int i=2;i<= length;i++ )
		{
			c = a+ b;
			a=b;
			b=c;
			System.out.print( " "+c);

			
		}
		c = a+ b;
		a=b;
		b=c;
		
	}
	

}
