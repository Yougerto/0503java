package tw.org.iii.tutor;

import java.util.Arrays;

public class UprimeNumber0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] Nub= new int[100];
		for(int i = 3;i <100;i++) {
			for(int j = 1 ; j<i;j++)
				if((i%2!=0) && (i%j!=0)) {
					System.out.println(i);
				}
			}
		}
//		System.out.println(Arrays.toString(Nub));

	}

