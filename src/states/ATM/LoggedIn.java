package states.ATM;

import proxy.atm.BankProxy;
import proxy.atm.ABank;
import visitor.MoneyParser;
import command.CheckBalance;
import command.DepositAmount;
import command.ICommand;

public class LoggedIn extends AState{

	BankProxy bankProxy = new BankProxy();
	MoneyParser moneyParser = new MoneyParser();
	
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
		
		ICommand checkBalance = new CheckBalance(bankProxy);
		invoker.executeAction(checkBalance);
		System.out.println("bankProxy.getBalance():" + bankProxy.getBalance());
		return bankProxy.getBalance();
	}

	@Override
	public void drawAmount(ATMContext atmContext) {
		
		
	}

	@Override
	public void depositAmount(ATMContext atmContext) {
		
		ICommand depositAmount = new DepositAmount(moneyParser);
		
		invoker.executeAction(depositAmount);
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
