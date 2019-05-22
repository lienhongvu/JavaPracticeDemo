package com.lienhongvu.testother;

/**
 * Created by hvlien on 1/10/2019.
 */
public class Implementation implements Interface1, Interface2{
    @Override
    public void playSound() {
        System.out.println("play sound now");
    }

    @Override
    public void display() {
        System.out.println("display sound name");
    }
}
