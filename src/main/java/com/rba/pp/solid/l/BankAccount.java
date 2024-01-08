package com.rba.pp.solid.l;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        System.out.println("amount value");
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        System.out.println("Only 50 bucks for day ");
    }
}

class CurrentAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        System.out.println("Exceeds overdraft limit");
    }
}


