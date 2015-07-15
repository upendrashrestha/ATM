package extendedClass;

import interfaceClass.Account;
import interfaceClass.Person;

public class Customer extends Person {

	private Account account;
	private String card;
	private String pin;
	
	public Customer(String name, String address, Account account, String card, String pin) {
		
		super(name, address);
		
		this.account = account;
		this.card    = card;
		this.pin     = pin;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getPin() {
		return pin;
	}

}
