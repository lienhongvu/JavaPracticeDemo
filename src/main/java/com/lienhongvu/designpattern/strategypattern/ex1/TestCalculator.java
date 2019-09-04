package com.lienhongvu.designpattern.strategypattern.ex1;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperationStrategy(new AddOperation());
        double result = calculator.calculate(15, 20);
        System.out.println(String.format("15 + 20 = %f", result));

        calculator.setOperationStrategy(new SubtractOperation());
        System.out.println(String.format("%f - 15 = %f", result, result = calculator.calculate(result, 15)));

        calculator.setOperationStrategy(new MultiplyOperation());
        System.out.println(String.format("%f * 20 = %f", result, result = calculator.calculate(result, 20)));

        calculator.setOperationStrategy(new DivideOperation());
        System.out.println(String.format("%f / 400 = %f", result, calculator.calculate(result, 400)));
    }
}
