package com.lienhongvu.designpattern.strategypattern.ex2;

/**
 * Created by hvlien on 10/6/2017.
 */
public class GoByFlyingAlgorithm implements GoAlgorithm {

    @Override
    public void go() {
        System.out.println("I'm flying now");
    }
}
