package inheritance;

public class hirarchicalchild extends hirarchikalparent 
{
	public void job()
	{
		System.out.println("salary");
	}
	public static void main(String [] agrs)
	{
		hirarchicalchild x = new hirarchicalchild();
		x.farm();
		x.home();
		x.money();
		x.job();
	}
}
