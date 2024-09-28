package org.example.typeofClasses.innerClass.Bank;

public class BankAccount {
    private double balance;


    public BankAccount(double balance) {
        this.balance = balance;
    }

    public class Transaction{

        void deposit(double amount) {
            double result = BankAccount.this.balance + amount;
            System.out.println("Вы пополнили счет на " + amount + ", было на счету: " + BankAccount.this.balance + ", новый счет: "
                    + result);
        }
        void withdraw(double amount){
            if (BankAccount.this.balance < amount) {
                System.out.println("Вы пытаетесь снять больше чем у вас есть на счету");
            }
            if (BankAccount.this.balance >= amount){
                double result = BankAccount.this.balance - amount;
                System.out.println("Вы сняли со счета " + amount + ", было на счету: " + BankAccount.this.balance + ", осталось на счету: "
            + result);
            }
        }
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
