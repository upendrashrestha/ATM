package extendedClass;

import interfaceClass.Account;
import interfaceClass.Person;

public class Customer extends Person {

	private Account account;
	protected Customer(String name, String address, Account account) {
		super(name, address);
		this.account=account;

	}

}
