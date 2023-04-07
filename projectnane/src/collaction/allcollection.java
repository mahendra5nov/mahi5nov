package collaction;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class allcollection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("Automotion");
		list.add(23.78f);
		list.add('@');
		
		int s = list.size();//size of arraylist 
		System.out.println(s);
		
		for(int i=0;i<s;i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("*************************");
	
		list.remove(2);
		
		for (int i=0;i<=s;i++)
		{
			System.out.println(list.get(i));
		}
	
	
	}

}
