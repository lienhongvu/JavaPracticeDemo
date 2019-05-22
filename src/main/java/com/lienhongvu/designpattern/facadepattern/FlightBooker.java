package com.lienhongvu.designpattern.facadepattern;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by hvlien on 10/20/2017.
 */
public class FlightBooker {

    public List<String> getFlightsFor(Date from, Date to){
        return Arrays.asList("VJ501" + from.toString(), "VJ502" + to.toString());
    }
}
