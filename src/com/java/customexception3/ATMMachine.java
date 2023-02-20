package com.java.customexception3;

public class ATMMachine {
	static int balance = 10000;

	public void enterPIN(int pin) throws LoginException {
		if (pin == 1212) {
			System.out.println("Welcome !!");
			
		} else
			throw new LoginException("Your PIN is Incorrect");
	}

	public void checkBalance() throws CheckBalanceException {		
		System.out.println("Your Balance is : " + balance);
	}

	public void deposite(int amount) throws DepositeException {
		if (amount < 0) {
			throw new DepositeException("Please Deposte more than zero amount");
		} else {
			System.out.println("You Deposited Rs - " + amount);
			System.out.println("Now Total Balance is " + (amount + balance));
		}
	}

	public void withdraw(int amount) throws WithdrawException {
		if (amount > balance) {
			throw new WithdrawException("You have insufficent Balance");
		} else {

			System.out.println("You are withdrawing " + amount);
			System.out.println("Now Total Balance is : " + (balance - amount));
		}
	}

}
