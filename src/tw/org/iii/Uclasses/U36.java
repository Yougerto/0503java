package tw.org.iii.Uclasses;

import java.util.HashSet;
import java.util.Iterator;

public class U36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("iii");
		set.add("UUU");
		set.add("ERic");
		set.add("Peter");
		set.add("Tony");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===================");
		for(String v : set) {
			System.out.println(v);
		}
	}

}
