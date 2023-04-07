package string;

public class duplicate_charectors {
	public static void main(String[] args) {
		String a= " mahi mahi mahi mahi";
		int total = 0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char s = a.charAt(i);
			if ( s=='m')
			{
				total++;
			}
		}
		System.out.println(total);
	}

}
