package com.java.customexception3;

public class ATMMachineTest {

	public static void main(String[] args)
			throws LoginException, CheckBalanceException, DepositeException, WithdrawException {
		ATMMachine a = new ATMMachine();
		a.enterPIN(1212);
		a.checkBalance();
		a.deposite(-2000);
		
		//a.withdraw(15000);

	}

}
