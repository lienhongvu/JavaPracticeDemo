package com.lienhongvu.inheritance;

/**
 * Created by hvlien on 8/14/2017.
 */
public class Triangle extends Shape {

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("Children: " + (x + 1) );
        super.say();
        say();
    }

    public static void say(){
        System.out.println("child say");
    }

    public static void main(String[] args) {
        Triangle main = new Triangle();
        main.doSomething();
    }


}
