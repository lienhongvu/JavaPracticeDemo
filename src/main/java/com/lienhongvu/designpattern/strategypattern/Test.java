package com.lienhongvu.designpattern.strategypattern;

/**
 * Created by hvlien on 10/6/2017.
 */
public class Test {

    public static void main(String[] args) {
        Vehicle streetRacer = new Motorbike();
        Vehicle helicopter = new Airplane();
        streetRacer.go();
        helicopter.go();
    }
}
