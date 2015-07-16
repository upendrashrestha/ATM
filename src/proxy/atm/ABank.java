package proxy.atm;

import interfaceClass.Account;

 

/*
 * No need of this interface, 
 * Using this to implement facade pattern from proxy pattern.
 * Comment by : Upendra Shrestha
 * 
 */

public abstract class ABank  {

	protected boolean isSuccess = false;
	protected double balance = 0;
	
	public abstract void checkBalance();
	public abstract void drawAmount(double amount);
	public abstract void depositAmount(double amount);
	public abstract void changePin(String pin);
	public abstract void authenticatePin(String pin) ;
	//public void printReceipt();
	
	
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	}