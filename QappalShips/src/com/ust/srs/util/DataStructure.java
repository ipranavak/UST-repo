package com.ust.srs.util;

import java.util.ArrayList;
import com.ust.srs.bean.*;

public class DataStructure {
	public static ArrayList<CredentialsBean> Cred= new ArrayList<>();
	public static ArrayList<PassengerBean> Passenger= new ArrayList<>();
	public static ArrayList<ProfileBean> Profile= new ArrayList<>();
	public static ArrayList<ReservationBean> Reserve= new ArrayList<>();
	public static ArrayList<RouteBean> Route= new ArrayList<>();
	public static ArrayList<ScheduleBean> Schedule= new ArrayList<>();
	public static ArrayList<ShipBean> Ship= new ArrayList<>();
	public DataStructure() {
		Ship.add(new ShipBean("AR-100","Artemis",120,100));
		Ship.add(new ShipBean("AT-101","Atlantic",130,100));
		Ship.add(new ShipBean("PS-102","Poseidon",140,100));
		Ship.add(new ShipBean("TR-103","Titanic",150,100));
		Ship.add(new ShipBean("NE-104", "Neptune", 110, 90));

		Passenger.add(new PassengerBean("RS-1000", "TVCL-1000", "Arjun", 28, "M"));
		Passenger.add(new PassengerBean("RS-1000", "TVCL-1000", "Meera", 26, "F"));
		Passenger.add(new PassengerBean("RS-1001", "CLGO-1001", "Vikram", 34, "M"));
		Passenger.add(new PassengerBean("RS-1001", "CLGO-1001", "Asha", 30, "F"));
		Passenger.add(new PassengerBean("RS-1002", "GOMU-1002", "Ravi", 40, "M"));

		Schedule.add(new ScheduleBean("TVCL-1000", "AR-100", "TVCL-100", "2021-05-23"));
		Schedule.add(new ScheduleBean("CLGO-1001", "AT-101", "CLGO-101", "2021-05-24"));
		Schedule.add(new ScheduleBean("GOMU-1002", "PS-102", "GOMU-102", "2021-05-25"));
		Schedule.add(new ScheduleBean("MUKO-1003", "TR-103", "MUKO-103", "2021-05-26"));
		Schedule.add(new ScheduleBean("KOTV-1004", "NE-104", "KOTV-104", "2021-05-27"));

		Route.add(new RouteBean("TVCL-100", "Trivandrum", "Chennai", "18h", 2500));
		Route.add(new RouteBean("CLGO-101", "Chennai", "Goa", "16h", 2200));
		Route.add(new RouteBean("GOMU-102", "Goa", "Mumbai", "14h", 2000));
		Route.add(new RouteBean("MUKO-103", "Mumbai", "Kochi", "20h", 2800));
		Route.add(new RouteBean("KOTV-104", "Kochi", "Trivandrum", "6h", 1200));

		Reserve.add(new ReservationBean("RS-1000", "TVCL-1000", "US1001",
		    "2021-05-23", "2021-05-24", 2, 5000, "CONFIRMED"));
		Reserve.add(new ReservationBean("RS-1001", "CLGO-1001", "US1002",
		    "2021-05-24", "2021-05-25", 3, 6600, "CONFIRMED"));
		Reserve.add(new ReservationBean("RS-1002", "GOMU-1002", "US1003",
		    "2021-05-25", "2021-05-26", 1, 2200, "WAITLIST"));

		Profile.add(new ProfileBean(
		    "AD1000", "Arun", "Kumar", "1985-03-12", "Male",
		    "12 MG Road", "Palayam", "Trivandrum", "Kerala", "695001",
		    "9876543210", "arun.kumar@xyz.com", "admin123"
		));

		Profile.add(new ProfileBean(
		    "US1001", "Meera", "Raj", "1992-07-18", "Female",
		    "22 Beach Road", "Fort Kochi", "Kochi", "Kerala", "682001",
		    "9847123456", "meera.raj@example.com", "user123"
		));

		Profile.add(new ProfileBean(
		    "US1002", "Vikram", "Menon", "1990-09-10", "Male",
		    "5 Residency Lane", "Adyar", "Chennai", "Tamil Nadu", "600020",
		    "9887766554", "vikram.menon@example.com", "user456"
		));

		Profile.add(new ProfileBean(
		    "US1003", "Asha", "Varma", "1994-11-25", "Female",
		    "3 Hill View", "Mapusa", "Goa", "Goa", "403507",
		    "9123456789", "asha.varma@example.com", "user789"
		));

		Profile.add(new ProfileBean(
		    "US1004", "Ravi", "Nair", "1988-01-09", "Male",
		    "10 Seaside Ave", "Marine Drive", "Mumbai", "Maharashtra", "400001",
		    "9700001111", "ravi.nair@example.com", "pass123"
		));

		
		
	}
	public ArrayList<CredentialsBean> getCred() {
		return Cred;
	}
	public void setCred(CredentialsBean cred) {
		Cred.add(cred);
	}
	public ArrayList<PassengerBean> getPassenger() {
		return Passenger;
	}
	public void setPassenger(PassengerBean passenger) {
		Passenger.add(passenger);
	}
	public ArrayList<ProfileBean> getProfile() {
		return Profile;
	}
	public void setProfile(ProfileBean profile) {
		Profile.add(profile);
	}
	public ArrayList<ReservationBean> getReserve() {
		return Reserve;
	}
	public void setReserve(ReservationBean reserve) {
		Reserve.add(reserve);
	}
	public ArrayList<RouteBean> getRoute() {
		return Route;
	}
	public void setRoute(RouteBean route) {
		Route.add(route);
	}
	public ArrayList<ScheduleBean> getSchedule() {
		return Schedule;
	}
	public void setSchedule(ScheduleBean schedule) {
		Schedule.add(schedule);
	}
	public ArrayList<ShipBean> getShip() {
		return Ship;
	}
	public void setShip(ShipBean ship) {
		Ship.add(ship);
	}
	
	
	static {
    	new DataStructure();
    }
}


