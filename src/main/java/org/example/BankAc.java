package org.example;

public class BankAc {

    private String accountHolder;
    private double balance;

    public BankAc(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println(amount + " deposited successfully");
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(double amount){
        if(amount >0 && amount<=balance){
            balance-=amount;
            System.out.println(amount+"withdrwan successfully");
        }
        else {
            System.out.println("Insufficent amount or invalid amount");
        }
    }
    public void showBalance(){
        System.out.println(accountHolder + "'s balance: "+balance);
    }
}
