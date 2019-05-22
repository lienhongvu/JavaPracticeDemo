package com.lienhongvu.designpattern.singletonpattern;

/**
 * Created by hvlien on 1/7/2019.
 */
public final class TestSingleton {

    public static void main(String[] args) {
        final SingletonInSingleThread instance1 = SingletonInSingleThread.getInstance();

        try {
            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + SingletonInSingleThread.getCloneInstance().hashCode());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        instance1.sayHi(2);

    }
}
