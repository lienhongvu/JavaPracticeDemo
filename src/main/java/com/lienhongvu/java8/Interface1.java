package com.lienhongvu.java8;

/**
 * Created by hvlien on 1/16/2019.
 */

public interface Interface1 {

    void display1();

    default void display2(String message){
        System.out.println(message);
    }
}
