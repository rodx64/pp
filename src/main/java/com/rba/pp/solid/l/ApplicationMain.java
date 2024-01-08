package com.rba.pp.solid.l;

public class ApplicationMain {
    public static void main(String[] args) {
        BankAccount current = new CurrentAccount();
        BankAccount saving = new SavingsAccount();

        expectBankAccount(current);
        expectBankAccount(saving);
    }

    static void expectBankAccount(BankAccount bankAccount){
        if(bankAccount instanceof CurrentAccount) System.out.println("Current OK");
        if(bankAccount instanceof SavingsAccount) System.out.println("Savings OK");
    };

}
