package com.lienhongvu.designpattern.adapterpattern;

/**
 * Created by hvlien on 10/13/2017.
 */
public interface AcmeInterface {
    void setFirstName(String f);

    void setLastName(String l);

    String getFirstName();

    public abstract String getLastName();
}
