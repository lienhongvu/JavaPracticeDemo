package com.lienhongvu.designpattern.strategypattern.ex2;

/**
 * Created by hvlien on 10/6/2017.
 */
public class Airplane extends Vehicle {
    public Airplane() {
        super(new GoByFlyingAlgorithm());
    }
}
