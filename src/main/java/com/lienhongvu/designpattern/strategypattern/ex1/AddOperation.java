package com.lienhongvu.designpattern.strategypattern.ex1;

public class AddOperation implements OperationStrategy {

    @Override
    public double doOperation(double number1, double number2) {
        return number1 + number2;
    }
}
