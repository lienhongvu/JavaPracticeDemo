package com.lienhongvu.designpattern.templatepattern;

/**
 * Created by hvlien on 10/20/2017.
 */
public class CookieRobot extends RobotTemplate {

    private String name;

    public CookieRobot(String name) {
        this.name = name;
    }

    @Override
    public void getParts() {
        System.out.println("Getting flour and sugar...");
    }

    @Override
    public void assemble() {
        System.out.println("Baking a cookie...");
    }

    @Override
    public void test() {
        System.out.println("Crunching a cookie...");
    }

    public String getName() {
        return name;
    }
}
