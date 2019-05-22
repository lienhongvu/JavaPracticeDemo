package com.lienhongvu.callable;

import java.util.concurrent.*;

/**
 * Created by hvlien on 8/22/2018.
 */
public class MyCallableThrowException implements Callable<Integer>{

    private int number;
    MyCallableThrowException(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        if(number < 0) throw new IllegalArgumentException("Input number must not be negative");
        return number;
    }

    public static void main(String[] args) {
        MyCallableThrowException myCallableThrowException = new MyCallableThrowException(-1);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(myCallableThrowException);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println("done");
    }
}
