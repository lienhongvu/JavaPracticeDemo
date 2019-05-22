package com.lienhongvu.designpattern.singletonpattern;

import java.io.Serializable;

/**
 * Created by hvlien on 1/7/2019.
 *
 * Lazy loading
 * Use for single thread environment.
 */
public class SingletonInSingleThread implements Cloneable {

    private static SingletonInSingleThread INSTANCE;

    private SingletonInSingleThread() {}

    public static SingletonInSingleThread getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonInSingleThread();
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }

    public static SingletonInSingleThread getCloneInstance(){
        try {
            return (SingletonInSingleThread) INSTANCE.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    int times = 0;
    public void sayHi(int times){
        this.times = times;
        System.out.println("Hi, times at " + times);
    }
}
