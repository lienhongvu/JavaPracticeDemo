package com.lienhongvu.designpattern.adapterpattern;

/**
 * Created by hvlien on 10/13/2017.
 */
public class AceToAcmeAdapter implements AcmeInterface {

    AceImplement aceImplement;
    String firstName;
    String lastName;

    public AceToAcmeAdapter(AceImplement ace) {
        aceImplement = ace;
        firstName = aceImplement.getName().split(" ")[0];
        lastName = aceImplement.getName().split(" ")[1];
    }

    @Override
    public void setFirstName(String f) {
        firstName = f;
    }

    @Override
    public void setLastName(String l) {
        lastName = l;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
