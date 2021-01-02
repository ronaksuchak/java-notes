package com.app.core;

import static java.lang.Thread.*;
//joint account
public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance
	public  synchronized void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal : " + currentThread().getName());
		balance = balance + amt;
		System.out.println("Cancelling updates, after a dly");//bal=5500
		Thread.sleep(20);
		balance = balance - amt;
		System.out.println("Updations over by " + currentThread().getName());//bal=5000
	}

	// chk balance
	public synchronized double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());
		Thread.sleep(37);
		return balance;

	}

}
