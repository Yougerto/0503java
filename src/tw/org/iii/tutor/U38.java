package tw.org.iii.tutor;

import java.util.LinkedList;

public class U38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);list.add(3);list.add(4);
		System.out.println(list);
		list.add(99);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println("-----------");
		
		list.add(2, 7);
		System.out.println(list);
		

}
}
