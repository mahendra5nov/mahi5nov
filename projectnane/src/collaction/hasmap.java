package collaction;

import java.util.HashMap;
import java.util.Map;

public class hasmap {
	
	//random data insertion
	
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap();
		
		map.put(null, "Automotion");//only one null is accepted in key
		map.put(32, null);
		map.put(22,null );
		map.put(null, "API");
		for(Map.Entry<Integer, String> m :map.entrySet()) {
		System.out.println("key="+m.getKey()+" value="+m.getValue());
	}
		
		System.out.println("******************");
		
		map.put(34, "mahendra");
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println("key="+m.getKey()+"value="+m.getValue());
		}
		
		
		
	}
}
