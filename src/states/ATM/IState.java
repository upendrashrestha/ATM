package states.ATM;

public interface IState {

	public void insertCard(ATMContext atmContext, String string);
	public boolean insertPin(ATMContext atmContext, String pin);
	public void checkBalance(ATMContext atmContext);
	public void drawAmount(ATMContext atmContext);
	public void depositAmount(ATMContext atmContext);
	public void changePin(ATMContext atmContext);
	public void payUtility(ATMContext atmContext);
	public void notifyDamage(ATMContext atmContext);
	public void notifyOutOfMoney(ATMContext atmContext);
	public void printReceipt(ATMContext atmContext);
	public void sendSMS(ATMContext atmContext);
	
	
}
