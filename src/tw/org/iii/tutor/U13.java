package tw.org.iii.tutor;

import java.util.Iterator;

public class U13 {

	public static void main(String[] args) {
	int i = 0;
		for (printU(); i<=10; printline()) {
			
			System.out.println(i++);
		}
		
	}
	static void printU() {
		System.out.println("U");
	}
	static void printline() {
		System.out.println("----");
	}
}

	