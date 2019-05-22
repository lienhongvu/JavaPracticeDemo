package com.lienhongvu.designpattern.singletonpattern;

/**
 * Created by hvlien on 1/7/2019.
 *
 * Class loading
 * Used in multi threaded environment
 * Instance is created once when class is firstly loaded into JVM
 */
public class SingletonInMultiThread {
    private static final SingletonInMultiThread INSTANCE = new SingletonInMultiThread();

    private SingletonInMultiThread() {}

    public static SingletonInMultiThread getInstance(){
        return INSTANCE;
    }
}
