package com.bridgeLabz.exception;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50}; // Sample array

        try {
            // Taking user input for index
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();

            try {
                // Accessing the element at the given index
                int element = numbers[index];

                // Taking user input for divisor
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                // Performing division
                int result = element / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            scanner.close();
        }
    }
}

