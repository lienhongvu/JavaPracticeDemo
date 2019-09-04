package com.lienhongvu.designpattern.singletonpattern.type1singlethread;

/**
 * Created by hvlien on 1/7/2019.
 * <p>
 * Lazy Instantiation
 * Use for single thread environment.
 */
public class SingletonInSingleThread {

    private static SingletonInSingleThread INSTANCE;

    private SingletonInSingleThread() {
    }

    public static SingletonInSingleThread getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonInSingleThread();
        }
        return INSTANCE;
    }
}
