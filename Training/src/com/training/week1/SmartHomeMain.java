package com.training.week1;

public class SmartHomeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartLight l=new SmartLight();
		l.turnOn();
		l.turnOff();
		l.adjustSettings(10);
		
		SmartThermostat t=new SmartThermostat();
		t.turnOn();
		t.turnOff();
		t.adjustSettings(10);

	}

}
