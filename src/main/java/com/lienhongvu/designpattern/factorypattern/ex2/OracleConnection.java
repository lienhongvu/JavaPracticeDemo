package com.lienhongvu.designpattern.factorypattern.ex2;

/**
 * Created by hvlien on 10/10/2017.
 */
public class OracleConnection extends Connection {
    @Override
    public String description() {
        return "Oracle server";
    }
}
