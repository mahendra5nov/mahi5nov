package method;

public class basic11 {
	//non static method declear in same class call in same class
		public void demo() 
		{
			System.out.println("demo is running");
		} 
	
		public static void test()
		{
			System.out.println(" test is running");
		}
         public static void main (String []agrs)
         {
        	 basic11 x = new basic11(); 
        	x. demo();
        
        	 test();
        	 
         }
       
}
