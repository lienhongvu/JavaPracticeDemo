package com.lienhongvu.javaconcurrent;

/**
 * Created by hvlien on 8/7/2018.
 */
public class SingleTonDoubleCheck {

    private static volatile SingleTonDoubleCheck INSTANCE;

    public static SingleTonDoubleCheck getINSTANCE(){
        if(INSTANCE == null){
            synchronized (SingleTonDoubleCheck.class){
                if(INSTANCE == null){
                    INSTANCE = new SingleTonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    private SingleTonDoubleCheck() {}
}