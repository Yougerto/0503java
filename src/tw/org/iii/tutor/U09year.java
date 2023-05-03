package tw.org.iii.tutor;

import java.util.Scanner;

public class U09year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
//		int year = 2023;
		if((year % 4)!=0 ) {
			System.out.println(year+"平年");
		}else if ((year % 100)!=0){
			System.out.println(year+"閏年");
		}else if ((year % 400)!=0) {
			System.out.println(year+"平年");
		}else {
			System.out.println(year+"閏年");
		}
	}
}
