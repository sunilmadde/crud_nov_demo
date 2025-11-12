package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAc acc1 = new BankAc(5000,"Sunil");
       acc1.showBalance();
      acc1.deposit(1000);
        acc1.withdraw(5000);


    }
}