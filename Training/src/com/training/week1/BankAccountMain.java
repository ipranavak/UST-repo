package com.training.week1;

public class BankAccountMain {
private int accountNumber;
private int balance;

	public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	if(this.balance<balance)
		System.out.println("Insufficient balance");
	else
	this.balance = balance;
}
BankAccountMain(int accountNumber,int balance)
{
	this.accountNumber=accountNumber;
	this.balance=balance;
}
public void deposit(int amount)
{
	this.balance=this.balance+amount;
}
public void withdraw(int amount)
{	
	if(this.balance<amount)
		System.out.println("Insufficient balance");
	else
	this.balance=this.balance-amount;
}
public void display()
{
	System.out.println("Account number: "+accountNumber+" Balance: "+balance);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountMain b=new BankAccountMain(123,2000);
		b.display();
		b.deposit(1000);
		b.display();
		b.withdraw(500);
		b.display();
	}

}
