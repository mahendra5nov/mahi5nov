package inheritance1;

import inheritance.hirarchikalparent;

public class hirarchicalchild1 extends hirarchikalparent 

{
	public void bike()
	{
		System.out.println("car");
	}
	public static void main(String[] agrs)
	{
		hirarchicalchild1 x =new hirarchicalchild1();
		x.farm();
		x.home();
		x.money();
		x.bike();
	}
}
