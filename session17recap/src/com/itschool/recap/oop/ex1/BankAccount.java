package com.itschool.recap.oop.ex1;

public class BankAccount {
    private String accountNumber;
    private String accountType;
    private double balance;
    private double interestRate;

    public BankAccount(String accountNumber, String accountType, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

