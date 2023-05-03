package tw.org.iii.tutor;

public class U07 {
	public static void main(String[] args) {

		double temp = Math.random()*101;
		int score = (int)temp;
	
		System.out.println(score);
		if (score >=100) {
			System.out.println("pass");
			
			
		}else {
			System.out.println("fail");
			
		}
	}
}
