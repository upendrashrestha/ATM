package command;

import general.Random;

import java.util.HashMap;
import java.util.Map;

import visitor.MoneyElement;
import visitor.MoneyParser;

public class DepositAmount implements ICommand{

	private MoneyParser moneyParser;
	
	public DepositAmount(MoneyParser moneyParser){

		this.moneyParser = moneyParser;
	}

	public void execute() {
		Map<MoneyElement, Integer> money = Random.generateMoneyMap();
		
		moneyParser.calculateMoney(money);
	}

	public void undo() {
		
	}

}
