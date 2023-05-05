package tw.org.iii.tutor;

import tw.org.iii.Uclasses.Bike;

public class U19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bike bike =new Bike();
			System.out.println("====");
//			System.out.println(bike.speed);
//			bike.upspeed();bike.upspeed();bike.upspeed();bike.upspeed();
			
			int x=0;
			while (bike.getspeed() <=7) {
				bike.upspeed();
				x++;
			}
			System.out.println(x);
			System.out.println(bike.getspeed());
			System.out.println(bike.getcolor());
	
	}

}
