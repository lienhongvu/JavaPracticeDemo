package com.lienhongvu.designpattern.facadepattern;

import java.util.Date;

/**
 * Created by hvlien on 10/20/2017.
 */
public class TravelFacade {

    private HotelBooker hotelBooker;

    private FlightBooker flightBooker;

    public TravelFacade() {
        flightBooker = new FlightBooker();
        hotelBooker = new HotelBooker();
    }

    public void printHotelsAndFlightsForBooking(Date from, Date to){
        System.out.println("Available hotels for you: " + hotelBooker.getHotelNamesFor(from, to).toString());
        System.out.println("Available flights for you: " + flightBooker.getFlightsFor(from, to).toString());
    }
}
