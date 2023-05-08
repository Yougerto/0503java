package tw.org.iii.Uclasses;

import java.io.Serializable;

public class Bike extends Object implements Serializable{
	protected double speed;
	private String color;
	public Bike() {
//		System.out.println("Bike()");
		color ="yellow";
	}
	public String getcolor() {
		
		return color;
	}
	public void upSpeed() {
		speed = speed <1?1:speed*1.25;
	}
	public void downspeed() {
		speed = speed <1?0:speed*0.7;
	}
	public double getspeed() {
		return speed;
	}
	public String toString() {
		return "Bike:" + speed;
	}
}
