package com.lienhongvu.designpattern.strategypattern;

/**
 * Created by hvlien on 10/6/2017.
 */
public class GoByDrivingAlgorithm implements GoAlgorithm {

    @Override
    public void go() {
        System.out.println("I'am driving now");
    }
}
