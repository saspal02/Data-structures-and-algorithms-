package com.java8;

interface Calculator {
    //void switchOn();
    //void add(int input);
    int subtract(int n1,int n2);
}

public class CalculatorImpl {
    public static void main(String[] args) {
//        Calculator calculator1 = () -> System.out.println("Switch On");
//        calculator1.switchOn();

//  Syntax: () -> (body);
//        Calculator calculator = (input) -> System.out.println("Sum: " + input);
//        calculator.add(50);

        Calculator calculator = (n1,n2) -> {
            if (n1 < n2) {
                throw new RuntimeException("message");
            } else {
                return n1 - n2;
            }
        };
        System.out.println(calculator.subtract(50,25));


    }
}
