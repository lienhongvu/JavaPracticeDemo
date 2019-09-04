package com.lienhongvu.designpattern.strategypattern.ex1;

public class Calculator {
    OperationStrategy operationStrategy;

    double calculate(double number1, double number2){
        return operationStrategy.doOperation(number1, number2);
    }

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }
}
