package command;

import general.Random;

import java.util.HashMap;
import java.util.Map;

import visitor.MoneyElement;
import visitor.MoneyParser;

public class DepositAmount implements ICommand{

	private MoneyParser moneyParser;
	private double amount;
	
	public DepositAmount(MoneyParser moneyParser, double amount) {

		this.moneyParser = moneyParser;
		this.amount = amount;
	}

	@Override
	public void execute() {
		Map<MoneyElement, Integer> money = Random.generateMoneyMap();
		
		moneyParser.calculateMoney(money);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
