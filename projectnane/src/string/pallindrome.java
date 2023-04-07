package string;

public class pallindrome {
	public static void main(String[] args) {
		String p = "nayan";
		String reverse ="";
		for (int i=p.length()-1;i>=0;i--)
		{
			reverse=  reverse +p.charAt(i);
			//System.out.println(reverse);
			
		}
		if(p.equals(reverse))
		{
			System.out.println("the given string is pallidraome");
		}
		else 
		{
			System.out.println("the giveen string not pallidrime");
		}
	}

}
