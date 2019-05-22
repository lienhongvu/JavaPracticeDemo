package com.lienhongvu.designpattern.singletonpattern;

import java.io.Serializable;

/**
 * Created by hvlien on 1/7/2019.
 */
public enum SingletonByEnum implements Serializable {
    INSTANCE;

    SingletonByEnum() {
    }


    protected Object readObject(){
        return INSTANCE;
    }
}
