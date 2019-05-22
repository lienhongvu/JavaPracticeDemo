package com.lienhongvu.designpattern.facadepattern;

import java.util.Date;

/**
 * Created by hvlien on 10/20/2017.
 */
public class TestFacade {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.printHotelsAndFlightsForBooking(new Date(), new Date());
    }
}
