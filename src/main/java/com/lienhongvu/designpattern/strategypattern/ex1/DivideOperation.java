package com.lienhongvu.designpattern.strategypattern.ex1;

public class DivideOperation implements OperationStrategy {

    @Override
    public double doOperation(double number1, double number2) {
        return number1 / number2;
    }
}
