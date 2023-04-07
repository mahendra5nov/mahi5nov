package statement;

public class ifelseif // else ladder
{
	public static void main(String [] args)
	{
	int marks=61;
	if(marks>75)
	{
		System.out.println("student pass in destigntion");
		
	}
	else if(marks>60)
	{
		System.out.print("student is pass in first class");
	}
	else if (marks>50)
	{
		System.out.println("student is pass in second class");
	}
	else if(marks>35)
	{
		System.out.println("student is pass");
	}
	else {
		System.out.println("student is fail");	
	}
	}

}
