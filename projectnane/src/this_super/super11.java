package this_super;

public class super11 extends supers {
	int a=60;
	public void sub()
	{
		int a=34;
		System.out.println(a);//34 local
		System.out.println(this.a);//60 global from same class
		System.out.println(super.a);// 90 global from different class
	}
	public static void main(String [] agrs)
	{
		super11 x = new super11();
		x.sub();
	}
}
