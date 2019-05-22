package com.lienhongvu.designpattern.adapterpattern;

/**
 * Created by hvlien on 10/13/2017.
 */
public class AceImplement implements AceInterface {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
