package com.kodilla.kalkulator;

public class Calculator {

    public double addAToB(double numberA, double numberB) {
        return numberA + numberB;
    }
    public double subtractAFromB(double numberA, double numberB) {
        return numberA + numberB;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double addition = calculator.addAToB(100.8, 329.5);
        double subtraction = calculator.subtractAFromB(100.8, 329.5);

        System.out.println("When you add 100.8 to 329.5 you get " + addition);
        System.out.println("When you subtract 100.8 from 329.5 you get " + subtraction);
    }
}
