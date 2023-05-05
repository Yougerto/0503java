package tw.org.iii.tutor;

import java.util.HashSet;

public class U37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//不重複 隨便取出
		HashSet<Integer> lottery = new HashSet<>();
		while(lottery.size()<6) {
			lottery.add((int)(Math.random()*49+1));
		}
		System.out.println(lottery);
	}

}
