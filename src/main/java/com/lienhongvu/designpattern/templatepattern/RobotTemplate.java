package com.lienhongvu.designpattern.templatepattern;

/**
 * Created by hvlien on 10/20/2017.
 */
public abstract class RobotTemplate {

    public final void go(){
        start();
        getParts();
        assemble();
        test();
        stop();
    }

    public void start(){
        System.out.println("Starting...");
    }

    public void getParts(){
        System.out.println("Getting parts...");
    }

    public void assemble(){
        System.out.println("Assembling...");
    }

    public void test(){
        System.out.println("Testing...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }
}
