package command;

import general.Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import proxy.atm.ABank;
import proxy.atm.BankProxy;
import visitor.MoneyElement;
import visitor.MoneyParser;

public class DepositAmount implements ICommand{

	private MoneyParser moneyParser;
	private ABank bankProxy = new BankProxy();

	public DepositAmount(MoneyParser moneyParser){

		this.moneyParser = moneyParser;
	}

	public void execute() {
		Map<MoneyElement, Integer> moneyMap = Random.generateMoneyMap();

		List<MoneyElement> moneyList = new ArrayList<MoneyElement>(
				moneyMap.keySet());

		System.out.println();
		System.out.println("Depositing Amount......");
		System.out.println("Dollars" +  "\t" + "\t" + "Denominations");
		for (MoneyElement money : moneyList) {

			System.out.println(money.getClass().getSimpleName() + "\t"
					+ moneyMap.get(money));

		}


		double depositAmount = moneyParser.calculateMoney(moneyMap);
		bankProxy.depositAmount(depositAmount);
	}

	public void undo() {

	}

}
