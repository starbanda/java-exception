package com.bridgeLabz.exception;

import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take user input
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block always executes
            System.out.println("Operation completed.");
            scanner.close();
        }
    }
}
