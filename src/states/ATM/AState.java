package states.ATM;

import command.RequestInvoker;

public abstract class AState {

	protected RequestInvoker invoker = new RequestInvoker();
	
	public abstract void insertCard(ATMContext atmContext, String string);
	public abstract boolean insertPin(ATMContext atmContext, String pin);
	public abstract double checkBalance(ATMContext atmContext);
	public abstract void drawAmount(ATMContext atmContext);
	public abstract void depositAmount(ATMContext atmContext);
	public abstract void changePin(ATMContext atmContext);
	public abstract void payUtility(ATMContext atmContext);
	public abstract void notifyDamage(ATMContext atmContext);
	public abstract void notifyOutOfMoney(ATMContext atmContext);
	public abstract void printReceipt(ATMContext atmContext);
	public abstract void sendSMS(ATMContext atmContext);
	
	
}
