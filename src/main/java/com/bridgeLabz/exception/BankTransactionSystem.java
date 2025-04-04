package com.bridgeLabz.exception;

import java.util.Scanner;

// Custom checked exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // Initial balance: 5000

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            // Attempt withdrawal
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Transaction completed.");
        }
    }
}
9
