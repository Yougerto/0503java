package tw.org.iii.Uclasses;

public class Scooter extends Bike{
	private int gear;
	public void upspeed() {
	// TODO Auto-generated method stub
	speed = speed <1? 1:speed * gear * 1.2;
	}
	
	public int changerGear(int newGear) {
		if(newGear>=0 && newGear<4) {
			gear =newGear;
		}
		return gear;
		
	}
}
