package states.ATM;

import extendedClass.ATMCustomer;
import extendedClass.Customer;

public class NoCard implements IState{

	@Override
	public void insertCard(ATMContext atmContext, String card) {
		
		Customer atmCustomer = ATMCustomer.getInstance(card);
		System.out.println("atmCustomer:" + atmCustomer.getCard());
		atmContext.setCurrentState(atmContext.getHasCard());
		
	}

	@Override
	public boolean insertPin(ATMContext atmContext, String pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkBalance(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawAmount(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositAmount(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePin(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payUtility(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyDamage(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyOutOfMoney(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printReceipt(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}
	
	
}
