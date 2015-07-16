package command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chainOfResponsibility.AMoneyCounter;
import proxy.atm.ABank;
import visitor.FiftyDollar;
import visitor.FiveDollar;
import visitor.HundredDollar;
import visitor.MoneyElement;
import visitor.OneDollar;
import visitor.TenDollar;
import visitor.TwentyDollar;

public class DrawAmount implements ICommand {

	private ABank bankProxy;
	private Double amount;
	
	public DrawAmount(ABank bankProxy, Double amount) {
		
		this.bankProxy = bankProxy;
		this.amount = amount;
	}

	public void execute() {
		
		bankProxy.drawAmount(amount);
		
		boolean isSuccess = bankProxy.isSuccess();

		if (isSuccess) {
			AMoneyCounter hundredCounter = new HundredDollar();
			AMoneyCounter fiftyCounter = new FiftyDollar();
			AMoneyCounter twentyCounter = new TwentyDollar();
			AMoneyCounter tenCounter = new TenDollar();
			AMoneyCounter fiveCounter = new FiveDollar();
			AMoneyCounter oneCounter = new OneDollar();

			hundredCounter.setNextCounter(fiftyCounter);
			fiftyCounter.setNextCounter(twentyCounter);
			twentyCounter.setNextCounter(tenCounter);
			tenCounter.setNextCounter(fiveCounter);
			fiveCounter.setNextCounter(oneCounter);

			Map<MoneyElement, Integer> map = new HashMap<MoneyElement, Integer>();
			hundredCounter.count(map, amount);

			List<MoneyElement> moneyList = new ArrayList<MoneyElement>(
					map.keySet());

			System.out.println();
			System.out.println("Draw Amount");
			System.out.println("Dollars" + "\t" + "Denominations");
			for (MoneyElement money : moneyList) {

				System.out.println(money.getClass().getSimpleName() + "\t"
						+ map.get(money));

			}

		}
		
	}

	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
