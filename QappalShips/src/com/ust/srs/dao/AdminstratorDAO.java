package com.ust.srs.dao;

import java.util.ArrayList;

import com.ust.srs.bean.PassengerBean;
import com.ust.srs.bean.RouteBean;
import com.ust.srs.bean.ScheduleBean;
import com.ust.srs.bean.ShipBean;
import com.ust.srs.service.*;
import com.ust.srs.util.DataStructure;

public class AdminstratorDAO implements Adminstrator {

	@Override
	public String addShip(ShipBean shipbean) {
		// DataStructure ds=new DataStructure();
		DataStructure.Ship.add(shipbean);
		return shipbean.getShipID();
	}

	@Override
	public boolean modifyShip(ShipBean shipbean) {
		for (ShipBean s : DataStructure.Ship) {
			if (s.getShipID().equals(shipbean.getShipID())) {
				s.setShipName(shipbean.getShipName());
				s.setSeatingCapacity(shipbean.getSeatingCapacity());
				s.setReservationCapacity(shipbean.getReservationCapacity());
				return true;
			}
		}
		return false;
	}

	@Override
	public int removeShip(ArrayList<String> ShipIdList) {
		int count = 0;
		for (String id : ShipIdList) {
			if (DataStructure.Ship.removeIf(s -> s.getShipID().equals(id))) {
				count++;
			}
		}
		return count;
	}

	@Override
	public ShipBean viewByShipId(String ShipId) {
		for (ShipBean s : DataStructure.Ship) {
			if (s.getShipID().equals(ShipId)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public ArrayList<ShipBean> viewByAllShips() {
		return DataStructure.Ship;
	}

	@Override
	public String addRoute(RouteBean routebean) {
		DataStructure.Route.add(routebean);
		return routebean.getRouteID();
	}

	@Override
	public boolean modifyRoute(RouteBean routebean) {
		for (RouteBean r : DataStructure.Route) {
			if (r.getRouteID().equals(routebean.getRouteID())) {
				r.setSource(routebean.getSource());
				r.setDestination(routebean.getDestination());
				r.setTravelDuration(routebean.getTravelDuration());
				r.setFare(routebean.getFare());
				return true;
			}
		}
		return false;
	}

	@Override
	public int removeRoute(String routeid) {
		if (DataStructure.Route.removeIf(r -> r.getRouteID().equals(routeid))) {
			return 1;
		}
		return 0;
	}

	@Override
	public RouteBean viewByRouteId(String routeid) {
		for (RouteBean r : DataStructure.Route) {
			if (r.getRouteID().equals(routeid)) {
				return r;
			}
		}
		return null;
	}

	@Override
	public ArrayList<RouteBean> viewByAllRoute() {
		return DataStructure.Route;
	}

	@Override
	public String addSchedule(ScheduleBean schedulebean) {
		DataStructure.Schedule.add(schedulebean);
		return schedulebean.getScheduleID();
	}

	@Override
	public boolean modifySchedule(ScheduleBean schedulebean) {
		for (ScheduleBean s : DataStructure.Schedule) {
			if (s.getScheduleID().equals(schedulebean.getScheduleID())) {
				s.setShipID(schedulebean.getShipID());
				s.setRouteID(schedulebean.getRouteID());
				s.setStartDate(schedulebean.getStartDate());
				return true;
			}
		}
		return false;
	}

	@Override
	public int removeSchedule(ArrayList<String> scheduleidList) {
		int count = 0;
		for (String id : scheduleidList) {
			if (DataStructure.Schedule.removeIf(s -> s.getScheduleID().equals(id))) {
				count++;
			}
		}
		return count;
	}

	@Override
	public ScheduleBean viewByScheduleId(String scheduleid) {
		for (ScheduleBean s : DataStructure.Schedule) {
			if (s.getScheduleID().equals(scheduleid)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public ArrayList<ScheduleBean> viewByAllSchedule() {
		return DataStructure.Schedule;
	}

	//PASSENGER METHODs
	@Override
	public ArrayList<PassengerBean> viewPasengersByShip(String scheduleid) {
		ArrayList<PassengerBean> passengers = new ArrayList<>();
		for (PassengerBean p : DataStructure.Passenger) {
			if (p.getScheduleID().equals(scheduleid)) {
				passengers.add(p);
			}
		}
		return passengers;
	}

}
