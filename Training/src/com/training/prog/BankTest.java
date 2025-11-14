//Encapsulation
package com.training.prog;
class BankAccount {
    private double balance;//hidden

    public void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance!");
    }

    public double getBalance() { return balance; }//getter to access
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(1000);
        b.withdraw(400);
        System.out.println("Balance: " + b.getBalance());
    }
}
