package string;

public class stringmethos {
	public static void main (String [] agrs)
	{
		String a = "    velocity";
		String  b = "VELOCITY";
		String  c = " city";
		String  d = "    ma hi ";
		String  m= "mahrndra";
		String  n = "kriti";

		String  o = "shraddha";

		String  p = "kanika";

		
		System.out.println(a.charAt(5));//to find charector at possition of index
		
		System.out.println(a.replace("v", "t"));// to replace the charector with new one
		
		System.out.println(a.isEmpty());//to find the given string is empty or not true or false
		
		System.out.println(a.concat(c));// to join two string
		
		System.out.println(b.substring(3));//to create sub string
		
		System.out.println(b.substring(3, 6));// to create a string at starting and end point
		
		System.out.println(a.startsWith("ve"));// to check start with true or false
		
		System.out.println(a.endsWith(" y"));// to check string is end with or not true false
		
		System.out.println(a.indexOf("c"));  // to find index of charector comes first in string
		
		System.out.println(a.lastIndexOf("c"));// to find index of charector present in last
		
		System.out.println(a.length());// to find length of string
		
		System.out.println(a.contains(c));// to check string is present in string or not true or false
		
		System.out.println(a.equals(c));// to check string is same or not true or false
		
		System.out.println(a==c);// it's or method true or false
		
		System.out.println(a.equalsIgnoreCase(b));// ignor case and compair true or false
		
		System.out.println(a.toUpperCase());// lower to upper
		
		System.out.println(b.toLowerCase());// upper to lower
		
		System.out.println(d.trim());// to eliminate starting spacesas well as ending spaces
		
		String m1 = String.join(a,b,c ,d,n,o,p);
		System.out.println(m1);
		
		String  x = "mah end ra din kar kol te";
		String[] result = x.split(" ");
		for(int i=0;i<result.length;i++)
		{
			System.out.println(i);
		}
		

	}

}
