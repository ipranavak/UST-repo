package com.training.week1;

public class SmartLight extends Appliance{
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart light is turned on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart light is turned off");
		
	}

	@Override
	void adjustSettings(int level) {
		// TODO Auto-generated method stub
		System.out.println("Smart light settings are adjusted to level"+level);
		
	}
	

}
