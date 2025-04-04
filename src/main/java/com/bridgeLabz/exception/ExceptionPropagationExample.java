package com.bridgeLabz.exception;

public class ExceptionPropagationExample {

    // Method that throws an ArithmeticException
    public static void method1() {
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // Method that calls method1()
    public static void method2() {
        method1(); // Exception propagates to method2()
    }

    // Main method that calls method2() and handles the exception
    public static void main(String[] args) {
        try {
            method2(); // Exception propagates to main()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
