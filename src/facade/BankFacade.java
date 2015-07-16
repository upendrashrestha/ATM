package facade;

import extendedClass.ATMCustomer;
import extendedClass.Customer;
import proxy.atm.ABank;
import interfaceClass.Account;

public class BankFacade extends ABank {

	private Customer atmCustomer;
	
	public BankFacade(){
		processing();
	}

	public void processing()
	{
		System.out.println("Processing!...");
	}

	@Override
	public void checkBalance() {

		atmCustomer = ATMCustomer.getAtmCustomer();
		
		this.balance = atmCustomer.getAccount().getBalance();
	}

	@Override
	public void drawAmount( Account account,double amount) {
		account.deductBalance(amount);

	}

	@Override
	public void depositAmount(Account account, double amount) {
		account.addBalance(amount);


	}

	@Override
	public void changePin(Account account, String pin) {
		account.changePin(pin);

	}


	@Override
	public void authenticatePin(String pin) {

		Customer atmCust = ATMCustomer.getAtmCustomer();
		if(pin.equals(atmCust.getPin())){

			setSuccess(true);
			return;
		}

		setSuccess(false);
	}

}
