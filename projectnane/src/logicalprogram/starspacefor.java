package logicalprogram;

public class starspacefor 
{
	public static void main(String [] ages)
	{
		int space=3;
		int star=1;
		for(int i=1; i<=4; i++) {
			for(int j=0; j<=space;j++)
			{
				System.out.print(" ");
			}
		for (int k=1;k<=star; k++) {
	    
			System.out.print("*");
	     
		}
		System.out.println();
		star ++;
		space--;
	}
	}
}