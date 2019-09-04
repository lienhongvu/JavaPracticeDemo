package com.lienhongvu.designpattern.singletonpattern.type2doublechecked;


/**
 * Created by hvlien on 1/7/2019.
 * <p>
 * Lazy Instantiation
 * Used in multi threaded environment
 * Instance is created once when getInstance method is firstly called
 */
public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked INSTANCE;

    private SingletonDoubleChecked() {
    }

    public static SingletonDoubleChecked getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleChecked();
                }
            }
        }
        return INSTANCE;
    }
}
