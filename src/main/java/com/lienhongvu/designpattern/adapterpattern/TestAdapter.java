package com.lienhongvu.designpattern.adapterpattern;

/**
 * Created by hvlien on 10/13/2017.
 */
public class TestAdapter {

    public static void main(String[] args) {
        AceImplement ace = new AceImplement();
        ace.setName("Vu Lien");
        AceToAcmeAdapter aceToAcmeAdapter = new AceToAcmeAdapter(ace);
        TestAdapter testAdapter = new TestAdapter();
        testAdapter.printAcmeObject(aceToAcmeAdapter);
    }

    private void printAcmeObject(AcmeInterface acme){
        System.out.println(acme.getFirstName());
        System.out.println(acme.getLastName());
    }
}
