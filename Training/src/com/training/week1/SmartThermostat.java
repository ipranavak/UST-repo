package com.training.week1;

public class SmartThermostat extends Appliance{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart thermostat is turned on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart thermostat is turned off");
		
	}

	@Override
	void adjustSettings(int level) {
		// TODO Auto-generated method stub
		System.out.println("Smart thermostat settings are adjusted to level"+level);
		
	}

}
