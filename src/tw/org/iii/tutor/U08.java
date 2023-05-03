package tw.org.iii.tutor;

public class U08 {
	public static void main(String[] args) {

		double temp = Math.random()*101;
		int score = (int)temp;
	
//		System.out.println(score);
		if(score>90) {
			System.out.println(score);
			System.out.println("a");
		}else if(score>=80) {
			System.out.println(score);
			System.out.println("B");
		}else if(score>=70) {
			System.out.println(score);
			System.out.println("C");
		}else if(score>=60) {
			System.out.println(score);
			System.out.println("D");
		}else{
			System.out.println("E");
		}
	
	
	}
}
