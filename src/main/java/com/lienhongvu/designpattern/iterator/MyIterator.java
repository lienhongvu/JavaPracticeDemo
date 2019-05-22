package com.lienhongvu.designpattern.iterator;

/**
 * Created by hvlien on 1/9/2019.
 */
public interface MyIterator<T> {
    boolean hasNext();

    T next();
}
