package com.lienhongvu.designpattern.singletonpattern.type5withinnerstaticclass;

/**
 * Created by hvlien on 1/8/2019.
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}


