package proxy.atm;

import interfaceClass.Account;

 

/*
 * No need of this interface, 
 * Using this to implement facade pattern from proxy pattern.
 * Comment by : Upendra Shrestha
 * 
 */

public interface IBank  {

	public void checkBalance(Account account);
	public void drawAmount(Account account,double amount);
	public void depositAmount(Account account,double amount);
	public void changePin(Account account, String pin);
	//public void printReceipt();
	}