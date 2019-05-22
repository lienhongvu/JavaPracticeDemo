package com.lienhongvu.testother;

/**
 * Created by hvlien on 1/10/2019.
 */
public class ImplementationTest {
    public static void main(String[] args) {
        Interface1 interface1 = new Implementation();
        interface1.playSound();
        Interface2 interface2 = (Interface2) interface1;
        interface2.display();
    }
}
