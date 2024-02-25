package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Good Morning");
		hm.put(2, "Java");
		hm.put(3, "Collection");
		hm.put(4, "HashMap");
		System.out.println(hm);
		System.out.println(hm.get(2));
		hm.remove(1);
		System.out.println(hm);
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
		
		
		

	}

}
