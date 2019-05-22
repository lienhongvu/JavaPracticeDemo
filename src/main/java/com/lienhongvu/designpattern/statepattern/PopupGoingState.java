package com.lienhongvu.designpattern.statepattern;

/**
 * Created by hvlien on 1/9/2019.
 */
public class PopupGoingState implements PopupState {
    @Override
    public void popup() {
        System.out.println("Going now");
    }
}
