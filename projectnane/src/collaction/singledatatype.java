package collaction;

import java.util.ArrayList;

public class singledatatype {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(122);
		list.add(null);//accept the duplicate value
		list.add(5534);
		list.add(null);
		
		int s = list.size();
		
		for(int i=0;i<s;i++)
		{
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		System.out.println("************************");
		
		for (int i=0;i<s;i++)
		{
			System.out.println(list.get(i));
		}
			
	}

}
