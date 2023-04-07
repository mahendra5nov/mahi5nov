package package1;

public class classB {
	public static void main(String [] agrs)
	{
		classA y =new classA();
		System.out.println(y.m);
		//System.out.println(y.n);//private access specifier can not be call
		System.out.println(y.o);
		System.out.println(y.p);
	}

}
