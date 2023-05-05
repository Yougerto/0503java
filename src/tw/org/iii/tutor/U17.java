package tw.org.iii.tutor;

import java.util.Arrays;

public class U17 {

	public static void main(String[] args) {
		int[][]a = new int[4][];
		a[0] = new int [5];
		a[1] = new int [6];
		a[2] = new int [7];
		a[3] = new int [8];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}System.out.println();
		}
		System.out.println("------------------");
		
	for(int[] a1:a) {
		for(int a2:a1) {
			System.out.print(a2+"  ");
		}
		System.out.println();
	}
	System.out.println("------------------");
		
		
	}

}