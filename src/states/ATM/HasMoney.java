package states.ATM;

public class HasMoney extends AState{

	@Override
	public void insertCard(ATMContext atmContext, String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertPin(ATMContext atmContext, String pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double checkBalance(ATMContext atmContext) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void drawAmount(ATMContext atmContext, Double amount) {
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

	@Override
	public void ejectCard(ATMContext atmContext) {
		// TODO Auto-generated method stub
		
	}

}
