package scanner;

import java.util.Scanner;

public class scan {
	public static void main(String [] agrs)
	{
		Scanner demo =new Scanner (System.in);//Scanner class object
		System.out.println("enter the integer:");
		int value= demo.nextInt();
		
		System.out.println("you entered value is:"+ value);
		System.out.println();
		System.out.println("enter the float :");
		 float value1= demo.nextFloat();
			System.out.println(" you entered value float is:" + value1);
			System.out.println();
			
			System.out.println("enter the string :");
			String value2 = demo.next();
			System.out.println(" you enterd value is :" + value2);
	}

}
