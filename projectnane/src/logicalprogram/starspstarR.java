package logicalprogram;

public class starspstarR 
{
	public static void main( String [] arg)
	{int space=4;
   for( int i=1; i<=5; i++)
   {
	  for(int j=1;j<=space;j++)
	  {
		  System.out.print(" ");
   }
	  for (int k=1;k<=5;k++)
	  {
		  if(i==5||k==1||i==k)
		  {
			  System.out.print("*");
		  }
		  else 
		  {
			  System.out.print(" ");
		  }
	  }
	  System.out.println();
	  space--;
		
   }
	}
	}
