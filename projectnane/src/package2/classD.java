package package2;

import package1.classA;

public class classD extends classA{
	public static void main(String [] agrs)
	{
		classA s = new classA();
		System.out.println(s.m);
		classD b= new classD();
		System.out.println(b.m);//public
		System.out.println(b.o);//protected
	}

}
