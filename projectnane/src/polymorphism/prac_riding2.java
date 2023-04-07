package polymorphism;

public class prac_riding2 extends prac_riding1 {
	
	public void testing()		
	{
		System.out.println( " velocty softer testing");
	}
	public void job()
	{
		System.out.println(" to get job");
	}
	public static void main(String[] args) {
		prac_riding2 m= new prac_riding2();
		m.job();
		m.testing();
		
		prac_riding1 n = new prac_riding2();
		n.job();
		n.testing();
	}
}
