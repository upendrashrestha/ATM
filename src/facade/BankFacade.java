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
	public void drawAmount( double amount) {
		atmCustomer = ATMCustomer.getAtmCustomer();
		atmCustomer.getAccount().deductBalance(amount);
		setSuccess(true);
	}

	@Override
	public void depositAmount( double amount) {
		atmCustomer = ATMCustomer.getAtmCustomer();
		atmCustomer.getAccount().addBalance(amount);
		setSuccess(true);

	}

	@Override
	public void changePin( String pin) {
		atmCustomer = ATMCustomer.getAtmCustomer();
		atmCustomer.getAccount().changePin(pin);

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
