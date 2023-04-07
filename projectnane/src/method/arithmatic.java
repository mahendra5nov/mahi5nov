package method;

public class arithmatic
{
   public void multiplication(int a, int b)
   {
	   int c=a*b;
	   System.out.println("multiplication = " +c);
	   
   }
   public static void addition()
   {
	   int a=34;
	   int b=54;
	   int c=a+b;
	   System.out.println("addition = " +c); 
   }
   public static void main(String []agrs) 
   {
	   addition();
	   arithmatic x =new arithmatic();
	   x.multiplication(22, 55);
	   x.multiplication(45, 02);
   }
}
