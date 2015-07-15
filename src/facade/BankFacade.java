package facade;

import extendedClass.ATMCustomer;
import extendedClass.Customer;
import proxy.atm.IBank;
import interfaceClass.Account;

public class BankFacade implements IBank {

	public BankFacade(){
		processing();
	}



	public void processing()
	{
		System.out.println("Processing!...");
	}

	@Override
	public void checkBalance(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Total Balance : "+account.getBalance());
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
	public boolean authenticatePin(String pin) {

		Customer atmCust = ATMCustomer.getAtmCustomer();
		if (atmCust == null){
			
			System.out.println("atmCust:" + atmCust);
		}
		String custPin = ATMCustomer.getAtmCustomer().getPin();
		System.out.println("custPin:" + custPin);
		if(pin.equals(custPin)){

			return true;
		}

		return false;
	}

}
