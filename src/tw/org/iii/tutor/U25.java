package tw.org.iii.tutor;
import tw.org.iii.Uclasses.*;

public class U25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "UUU";
		String str2 = "UUU";
		System.out.println(str1.equals(str2));
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.equals(b2));
		Bike b3 = b2;
		System.out.println(b2.equals(b3));
		System.out.println(b2==b3);
		
	}

}
