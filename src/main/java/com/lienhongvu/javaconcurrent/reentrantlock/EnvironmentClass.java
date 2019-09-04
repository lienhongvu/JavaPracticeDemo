package com.lienhongvu.javaconcurrent.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EnvironmentClass {

    private String config = "config";

    Lock lock = new ReentrantLock(true);

    public Lock getLock() {
        return lock;
    }
}
