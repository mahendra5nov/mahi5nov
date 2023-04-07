package interfacee;

public class test_test implements test{
		public void cycle()
		{	
			System.out.println("cycle in testtest");
		}
		public static void main (String [] agrs)
		{
			test_test x =new test_test();
			x.cycle();
			test.bike();
			//test_test.bike();
		}
	}
