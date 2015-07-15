package states.ATM;

import gui.AccountSelect;
import gui.Main;
import command.AuthenticatePin;
import command.ICommand;
import command.RequestInvoker;
import proxy.atm.BankProxy;
import proxy.atm.IBank;

public class HasCard implements IState{

	IBank bankProxy = new BankProxy();
	RequestInvoker invoker = new RequestInvoker();
	
	@Override
	public void insertCard(ATMContext atmContext, String card) {

	}

	@Override
	public boolean insertPin(ATMContext atmContext, String pin) {

		// User insert pin and press Enter
		ICommand authenticatePin = new AuthenticatePin(pin, bankProxy);
		boolean isSuccess = invoker.executeAction(authenticatePin);
		
		if(isSuccess){
			
			atmContext.setCurrentState(atmContext.getLoggedIn());
		}
		else{
			
			atmContext.setCurrentState(atmContext.getNoCard());
		}
		
		return isSuccess;
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
