package com.lienhongvu.designpattern.adapterpattern;

/**
 * Created by hvlien on 10/13/2017.
 */
public class AcmeImplement implements AcmeInterface {

    String firstName;
    String lastName;

    @Override
    public void setFirstName(String f) {
        this.firstName = f;
    }

    @Override
    public void setLastName(String l) {
        this.lastName = l;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
