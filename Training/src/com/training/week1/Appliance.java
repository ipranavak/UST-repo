package com.training.week1;

public abstract class Appliance implements SmartHomeDevice {
String brand;
String status;
public String getStatus() {
	return status;
}
abstract void adjustSettings(int level);
}