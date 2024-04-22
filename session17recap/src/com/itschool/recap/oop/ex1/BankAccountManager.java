package com.itschool.recap.oop.ex1;

public record BankAccountManager(BankAccount bankAccount) {

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= bankAccount.getBalance()) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Method to calculate interest and update balance
    public void calculateInterest() {
        double interest = bankAccount.getBalance() * bankAccount.getInterestRate() / 100;
        bankAccount.setBalance(bankAccount.getBalance() + interest);
        System.out.println("Interest calculated and added: $" + interest);
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Account Type: " + bankAccount.getAccountType());
        System.out.println("Balance: $" + bankAccount.getBalance());
        System.out.println("Interest Rate: " + bankAccount.getInterestRate() + "%");
    }
}
