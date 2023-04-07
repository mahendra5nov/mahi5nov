package string;

public class basic_memory_man {
	public static void main (String[] agrs)
	{
	String a= "velocity";
	String b="velocity";
	String c= new String("velocity");
	String d = new String("velocity");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	System.out.println("*******************************");
	System.out.println(a==b);//true not store other value store only one value in memory
	System.out.println(c==d);//false store two different values in memory
	System.out.println(a==c);// false
	
	b ="testing";
	
	System.out.println("***********************");

	System.out.println(a==b);//false store two different values in memory
	System.out.println(c==d);//false store two different values in memory
	System.out.println(a==c);//false
	
	b="velocity";
	System.out.println("********************");
	System.out.println(a==b);// true only one value in memory
	System.out.println(c==d);// false two different values in memory
	System.out.println(a==c);// false


	


	}

}
