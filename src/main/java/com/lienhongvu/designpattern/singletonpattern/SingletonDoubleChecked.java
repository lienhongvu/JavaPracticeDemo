package com.lienhongvu.designpattern.singletonpattern;

/**
 * Created by hvlien on 1/7/2019.
 *
 * Class loading
 * Used in multi threaded environment
 * Instance is created once when class is firstly loaded into JVM
 */
public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked INSTANCE;

    private SingletonDoubleChecked() {}

    public static SingletonDoubleChecked getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonDoubleChecked.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonDoubleChecked();
                }
            }
        }
        return INSTANCE;
    }
}
