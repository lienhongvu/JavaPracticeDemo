package com.lienhongvu.designpattern.statepattern;

/**
 * Created by hvlien on 1/9/2019.
 */
public class PopupReadyState implements PopupState {
    @Override
    public void popup() {
        System.out.println("Ready now");
    }
}
