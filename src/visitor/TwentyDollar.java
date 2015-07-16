package visitor;

import java.util.Map;

import chainOfResponsibility.AMoneyCounter;


public class TwentyDollar extends AMoneyCounter implements MoneyElement {

	@Override
	public void accept(IVisitor visitor, Integer number) {
		visitor.visit(this, number);
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public void count(Map<MoneyElement, Integer> map, double amount) {
		int numOfTwenty = (int) (amount / 20);
		int remainder = (int) (amount % 20);
		if (numOfTwenty > 0) {
			map.put(new TwentyDollar(), numOfTwenty);
			amount = amount - numOfTwenty * 20;
		}
		if (this.nextCounter != null) {
			this.nextCounter.count(map, amount);
		}		
	}

}
