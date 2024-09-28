package org.example.typeofClasses.innerClass.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10.3);
        BankAccount.Transaction transaction = bankAccount.new Transaction();
        transaction.deposit(23);
        transaction.withdraw(11.3);
    }
}
