package states.ATM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import proxy.atm.BankProxy;
import visitor.FiftyDollar;
import visitor.FiveDollar;
import visitor.HundredDollar;
import visitor.MoneyElement;
import visitor.MoneyParser;
import visitor.OneDollar;
import visitor.TenDollar;
import visitor.TwentyDollar;
import chainOfResponsibility.AMoneyCounter;
import command.CheckBalance;
import command.DepositAmount;
import command.DrawAmount;
import command.ICommand;

public class LoggedIn extends AState {

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

		return bankProxy.getBalance();
	}

	@Override
	public void drawAmount(ATMContext atmContext, Double amount) {

		ICommand drawAmount = new DrawAmount(bankProxy, amount);
		invoker.executeAction(drawAmount);


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

	@Override
	public void ejectCard(ATMContext atmContext) {

		atmContext.setCurrentState(atmContext.getNoCard());

	}

}
