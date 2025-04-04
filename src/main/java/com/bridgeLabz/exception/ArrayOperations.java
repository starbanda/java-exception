package com.bridgeLabz.exception;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array (can be replaced with user input or null to test exception handling)
        Integer[] numbers = {10, 20, 30, 40, 50};
        // Uncomment below to test NullPointerException
        // Integer[] numbers = null;

        try {
            System.out.print("Enter an index: ");
            int index = scanner.nextInt();

            // Attempt to access the array element
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred!");
        } finally {
            scanner.close();
        }
    }
}

