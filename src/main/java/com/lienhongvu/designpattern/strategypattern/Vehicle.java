package com.lienhongvu.designpattern.strategypattern;

/**
 * Created by hvlien on 10/6/2017.
 */
public abstract class Vehicle {
    private GoAlgorithm goAlgorithm;

    public Vehicle(GoAlgorithm goAlgorithm) {
        this.goAlgorithm = goAlgorithm;
    }

    public void go() {
        goAlgorithm.go();
    }
}
