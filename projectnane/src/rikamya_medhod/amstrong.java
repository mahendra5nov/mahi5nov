package rikamya_medhod;

public class amstrong {
	public static void main(String[] args) {
		int a = 152;
		int sum = 0;
		//int r ;
		for(int i=a; i>0;i=i/10)
		{
			
			 
			int r= i%10;
			
			sum = sum +(r*r*r*r);
			System.out.println(sum);
		}
		if (a== sum)
		{
			System.out.println(" amstrong aahe");
		
		}
		else
		{
			System.out.println(" amstrong nahi");

		}
		
	}

}
