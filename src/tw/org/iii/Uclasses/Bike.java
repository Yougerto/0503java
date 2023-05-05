package tw.org.iii.Uclasses;

public class Bike {
	protected double speed;
	private String color;
	public Bike() {
//		System.out.println("Bike()");
		color ="yellow";
	}
	public String getcolor() {
		
		return color;
	}
	public void upspeed() {
		speed = speed <1?1:speed*1.25;
	}
	public void downspeed() {
		speed = speed <1?0:speed*0.7;
	}
	public double getspeed() {
		return speed;
	}
}
