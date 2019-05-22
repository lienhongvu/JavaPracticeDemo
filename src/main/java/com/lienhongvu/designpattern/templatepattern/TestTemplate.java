package com.lienhongvu.designpattern.templatepattern;

/**
 * Created by hvlien on 10/20/2017.
 */
public class TestTemplate {

    public static void main(String[] args) {
        AutomotiveRobot aliceRobot = new AutomotiveRobot("Alice");
        System.out.println("--HELLO. I'am " + aliceRobot.getName());
        aliceRobot.go();

        CookieRobot cookieRobot = new CookieRobot("Cookie");
        System.out.println("--HELLO. I'am " + cookieRobot.getName());
        cookieRobot.go();
    }
}
