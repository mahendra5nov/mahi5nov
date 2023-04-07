package this_super;

public class thiss
{
	int a=12;// global
	public  void demo()
	{
		int a=33;//local
		System.out.println(a);//33
		System.out.println(this.a);//12
	}
	public  void test()
	{
		int a=22;
		System.out.println(a);//22
		System.out.println(this.a);//12
	}
	public static void main(String [] agrs)
	{
		thiss x = new thiss();
		x.demo();
		x.test();
	}
}
