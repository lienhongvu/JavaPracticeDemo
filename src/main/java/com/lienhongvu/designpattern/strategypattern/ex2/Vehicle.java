package com.lienhongvu.designpattern.strategypattern.ex2;

/**
 * Created by hvlien on 10/6/2017.
 */
public abstract class Vehicle {
    private GoAlgorithm goAlgorithm;

    void go() {
        goAlgorithm.go();
    }
}
