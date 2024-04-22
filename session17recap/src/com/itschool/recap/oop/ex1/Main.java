package com.itschool.recap.oop.ex1;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("RO123",
                "current account", 120, 7.2);
        BankAccountManager bankAccountManager = new BankAccountManager(bankAccount);

        bankAccountManager.displayAccountInfo();
        bankAccountManager.calculateInterest();
        System.out.println("New balance after interest is: " + bankAccount.getBalance());
        bankAccountManager.deposit(17.2);
        System.out.println("New balance after deposit is: " + bankAccount.getBalance());
        bankAccountManager.withdraw(1000);
        System.out.println("New balance after withdraw is: " + bankAccount.getBalance());
    }
}
