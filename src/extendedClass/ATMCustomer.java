package extendedClass;

import states.ATM.Data;
import interfaceClass.Account;
import interfaceClass.Person;

public class ATMCustomer extends Customer {

	private Account account;
	private static Customer atmCustomer;
	
	private ATMCustomer(String name, String address, Account account, String card, String pin) {
		
		super(name, address, account, card, pin);
	}
	
	public static Customer getInstance(String card){
		
		if(atmCustomer == null){
			
			atmCustomer = Data.getCustomer(card);
		}
		return atmCustomer;
	}

	public static Customer getAtmCustomer() {
		return atmCustomer;
	}

}
