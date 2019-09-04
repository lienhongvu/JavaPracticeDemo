package com.lienhongvu.designpattern.singletonpattern.type3firstloadwithfinal;

/**
 * Created by hvlien on 1/7/2019.
 *
 * Class loading
 * Used in multi threaded environment
 * Instance is created once when class is firstly loaded into JVM
 */
public class SingletonInFirstLoadWithFinal {
    private static final SingletonInFirstLoadWithFinal INSTANCE = new SingletonInFirstLoadWithFinal();

    private SingletonInFirstLoadWithFinal() {}

    public static SingletonInFirstLoadWithFinal getInstance(){
        return INSTANCE;
    }
}
