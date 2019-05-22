package com.lienhongvu.designpattern.facadepattern;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by hvlien on 10/20/2017.
 */
public class HotelBooker {

    public List<String> getHotelNamesFor(Date from, Date to){
        return Arrays.asList("Eden", "Novotel");
    }
}
