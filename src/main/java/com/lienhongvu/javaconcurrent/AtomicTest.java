package com.lienhongvu.javaconcurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by hvlien on 8/8/2018.
 */
public class AtomicTest {
}

class SafeCounterWithLock {
    /* make variable visibility among threads, mark it as volatile
    so that it will be written to main memory immediately, other threads access this variable
    directly from memory not from CPU cache instead */
    volatile int counter;

    // prevent multi threads access counter at the same time, avoid race condition code
    public synchronized void increment(){
        counter++;
    }

    // ==> PERFORMANCE TAKE A HIT
}

class SafeCounterWithoutLock {
    private AtomicInteger counter = new AtomicInteger();

    public void increment() {
        counter.compareAndSet(1,1);
    }
}
