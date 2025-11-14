package com.ust.srs.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ust.srs.bean.PassengerBean;
import com.ust.srs.bean.ReservationBean;
import com.ust.srs.bean.RouteBean;
import com.ust.srs.bean.ScheduleBean;
import com.ust.srs.service.Customer;
import com.ust.srs.util.DataStructure;

public class CustomerDAO implements Customer {

    @Override
    public ArrayList<ScheduleBean> viewScheduleByRoute(String source, String destination, String date) {
        ArrayList<ScheduleBean> result = new ArrayList<>();

        
        for (RouteBean route : DataStructure.Route) {
            if (route.getSource().equalsIgnoreCase(source)
                    && route.getDestination().equalsIgnoreCase(destination)) {

                for (ScheduleBean schedule : DataStructure.Schedule) {
                    if (schedule.getRouteID().equals(route.getRouteID())) {
                        result.add(schedule);
                    }
                }
            }
        }
        return result;
    }

    //RESERVE TICKET
    @Override
    public String reserveTicket(ReservationBean reservationBean, ArrayList<PassengerBean> passengerList) {
        
        String reservationId = "RS-" + (1000 + DataStructure.Reserve.size() + 1);
        reservationBean.setReservationID(reservationId);
       // reservationBean.setBookingDate(new Date());
        reservationBean.setBookingStatus("CONFIRMED");

        
        DataStructure.Reserve.add(reservationBean);

      
        for (PassengerBean passenger : passengerList) {
            passenger.setReservationID(reservationId);
            DataStructure.Passenger.add(passenger);
        }

        return reservationId;
    }

    // CANCEL TICKET
    @Override
    public boolean cancelTicket(String reservationId) {
        boolean found = false;

       
        for (ReservationBean res : DataStructure.Reserve) {
            if (res.getReservationID().equals(reservationId)) {
                res.setBookingStatus("CANCELLED");
                found = true;
                break;
            }
        }

        
        DataStructure.Passenger.removeIf(p -> p.getReservationID().equals(reservationId));

        return found;
    }

    // VIEW TICKET
    @Override
    public Map<ReservationBean, PassengerBean> viewTicket(String reservationId) {
        Map<ReservationBean, PassengerBean> ticketMap = new HashMap<>();

        for (ReservationBean res : DataStructure.Reserve) {
            if (res.getReservationID().equals(reservationId)) {
                for (PassengerBean p : DataStructure.Passenger) {
                    if (p.getReservationID().equals(reservationId)) {
                        ticketMap.put(res, p);
                    }
                }
            }
        }
        return ticketMap;
    }

    // PRINT TICKET
    @Override
    public Map<ReservationBean, PassengerBean> printTicket(String reservationId) {
       
        Map<ReservationBean, PassengerBean> ticket = new HashMap<>();

        for (ReservationBean res : DataStructure.Reserve) {
            if (res.getReservationID().equals(reservationId)) {
                for (PassengerBean p : DataStructure.Passenger) {
                    if (p.getReservationID().equals(reservationId)) {
                        ticket.put(res, p);
                    }
                }
            }
        }

       
        return ticket;
    }

}
