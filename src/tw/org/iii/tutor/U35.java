package tw.org.iii.tutor;

import java.util.HashSet;

import tw.org.iii.Uclasses.Bike;

public class U35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("UUU");
		set.add(new Bike());
		set.add(123);
		set.add("UUU");
		set.add(123);
		System.out.println(set.size());
		System.out.println(set.toString());
		
	}

}
