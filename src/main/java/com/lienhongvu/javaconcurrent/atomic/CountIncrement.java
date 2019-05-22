package com.lienhongvu.javaconcurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hvlien on 1/11/2019.
 */
public class CountIncrement {
    private AtomicInteger count = new AtomicInteger();

    public int count(){
        return count.get();
    }

    public void increaseCount(int number){
        boolean updated = false;
        while(!updated){
            updated = count.compareAndSet(count.get(), number);
        }
    }
}
