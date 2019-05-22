package com.lienhongvu.designpattern.singletonpattern;

/**
 * Created by hvlien on 1/8/2019.
 */
public class BillPughSingleton {

    private BillPughSingleton() {}

    public static class SingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
