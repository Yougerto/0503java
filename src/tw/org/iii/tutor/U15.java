package tw.org.iii.tutor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class U15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int p1, p2, p3, p4, p5, p6, p0;
			p1=p2=p4=p3=p5=p6=p0=0;
			int[] Parray = new int[100] ;
				for (int i = 0; i < 100; i++) {
					int point = (int)(Math.random()*6+1);
					Parray[i] = point;
					switch (point) {
					case 1:
						p1++;						
						break;
					case 2:
						p2++;						
						break;
					case 3:
						p3++;						
						break;
					case 4:
						p4++;						
						break;
					case 5:
						p5++;						
						break;
					case 6:
						p6++;						
						break;
					default:
						p0++;
						break;
					}
					
//					System.out.println(Parray[i]);
				}
				System.out.printf("p1=%d,p2=%d,p3=%d,p4=%d,p5=%d,p6=%d,p0=%d\n",p1,p2,p3,p4,p5,p6,p0);
				System.out.println(Arrays.toString(Parray));
	}

}
