package interfacetest;

public class basicdec implements besic
{
	public void brain() 
	{
		System.out.println("brain is strong");
		
	}
	public void heart()
	{
		System.out.println("heart is  love ");
	}
	public static void main (String []agrs ) 
	{
		basicdec d = new basicdec();
		d.brain();
		d.heart();
		besic b = new basicdec();
		b.brain();
		b.heart();
	}
}