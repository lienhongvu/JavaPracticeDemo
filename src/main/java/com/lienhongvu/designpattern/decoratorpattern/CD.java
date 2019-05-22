package com.lienhongvu.designpattern.decoratorpattern;

/**
 * Created by hvlien on 10/9/2017.
 */
public class CD extends ComponentDecorator {

    private Computer computer;

    public CD(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String description() {
        return computer.description() + " and a CD";
    }
}
